package parser;

import java.io.IOException;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.emoflon.ibex.tgg.operational.matches.IMatch;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.stlimportexport.INITIAL_FWD_App;
import org.xtext.example.mydsl.api.RunParser;
import org.xtext.example.mydsl.api.RunSerialiser;
import org.xtext.example.mydsl.myDsl.Solid;
import org.xtext.example.mydsl.rules.STLRules;

import Metamodell.Edge;
import Metamodell.Facet;
import Metamodell.Vector3f;
import Metamodell.impl.SolidImpl;

public class Parser
{
	
	private static SYNC sync;
	
	public static void main(String[] args) throws IOException
	{
		RunParser stlParser = new RunParser("Cube.stl");
		Optional<Solid> s = stlParser.parse();
		s.ifPresent(b -> {
			try
			{
				initialiseFwdSynchroniser();
				sync.getSourceResource().getContents().add(b);
				sync.forward();
				sync.saveModels();
				System.out.println(sync.getTargetResource().getContents());
				Metamodell.Solid solid = (Metamodell.Solid) sync.getTargetResource().getContents().get(0);
				
				mergeNormals((SolidImpl) solid);
				computeDegrees((SolidImpl) solid);
				
				STLRules rules = new STLRules(solid);
				rules.validateSolid(solid);
				
				RunSerialiser rSerialiser = new RunSerialiser();
				
				rSerialiser.unparse("example.stl", solid);
				
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		});
	}
	
	private static void initialiseFwdSynchroniser() throws IOException
	{
		if (sync != null)
		{
			sync.terminate();
		}
		sync = new INITIAL_FWD_App();
		sync.setUpdatePolicy(matches -> {
			Set<IMatch> _matches_ = matches.getMatches();
			for (IMatch m : _matches_)
			{
				if (m.getRuleName().equals("SolidRule"))
				{
					return m;
				}
				if (m.getRuleName().equals("VectorRule2"))
				{
					return m;
				}
			}
			return matches.getNext();
		});
	}
	
	/* =============================== CUSTOM =============================== */
	
	private static void mergeNormals(final SolidImpl solid)
	{
		final float EPSILON = 0.0000001f;
		for (Facet f1 : solid.getFacets())
		{
			Vector3f n1 = f1.getNormal();
			for (Facet f2 : solid.getFacets())
			{
				Vector3f n2 = f2.getNormal();
				if (f1 != f2 && Math.abs(n1.getX() - n2.getX()) <= EPSILON && Math.abs(n1.getY() - n2.getY()) <= EPSILON && Math.abs(n1.getZ() - n2.getZ()) <= EPSILON)
				{
					f2.setNormal(n1);
				}
			}
		}
	}
	
	private static void computeDegrees(final SolidImpl solid)
	{
		for (Facet f : solid.getFacets())
		{
			for (Edge e : f.getEdges())
			{
				computeDegree(e);
			}
		}
	}
	
	private static void computeDegree(final Edge e)
	{
		EList<Facet> facets = e.getF();
		if (facets.size() == 2)
		{
			Facet f1 = (Facet) facets.get(0);
			Facet f2 = (Facet) facets.get(1);
			double scalar = f1.getNormal().getX() * f2.getNormal().getX() + f1.getNormal().getY() * f2.getNormal().getY() + f1.getNormal().getZ() * f2.getNormal().getZ();
			double mult = Math.sqrt(f1.getNormal().getX() * f1.getNormal().getX() + f1.getNormal().getY() * f1.getNormal().getY() + f1.getNormal().getZ() * f1.getNormal().getZ()) * Math.sqrt(f2.getNormal().getX() * f2.getNormal().getX() + f2.getNormal().getY() * f2.getNormal().getY() + f2.getNormal().getZ() * f2.getNormal().getZ());
			
			double x = Math.toDegrees(Math.acos((Math.abs(scalar) / mult)));
			e.setDegree(x);
		}
	}
	
	/* =============================== DEBUG =============================== */
	
	public static void debug_PrintSolid(final SolidImpl solid)
	{
		System.out.println("Facets: " + solid.getFacets().size());
		for (Facet f : solid.getFacets())
		{
			System.out.println("Facet: " + f);
			System.out.println("\tSolid: " + f.getSolid());
			System.out.println("\tColor: " + f.getColor());
			System.out.println("\tNormal: " + debug_VectorToString(f.getNormal()));
			System.out.println("\tEdges:");
			for (Edge e : f.getEdges())
			{
				for (Vector3f v : e.getP())
				{
					System.out.println("\t\t" + debug_VectorToString(v));
				}
			}
			System.out.println("\tVector " + debug_VectorToString(f.getX()));
			System.out.println("\tVector " + debug_VectorToString(f.getY()));
			System.out.println("\tVector " + debug_VectorToString(f.getZ()));
		}
	}
	
	private static String debug_VectorToString(final Vector3f normal)
	{
		return normal.getX() + ", " + normal.getY() + ", " + normal.getZ();
	}
}
