package parser;

import java.io.IOException;
import java.util.Optional;
import java.util.Set;

import org.emoflon.ibex.tgg.operational.matches.IMatch;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.stlimportexport.INITIAL_FWD_App;
import org.emoflon.ibex.tgg.run.stlimportexport.SYNC_App;
import org.xtext.example.mydsl.api.RunParser;
import org.xtext.example.mydsl.api.RunSerialiser;
import org.xtext.example.mydsl.myDsl.Solid;
import org.xtext.example.mydsl.rules.STLRules;

import Metamodell.Color;
import Metamodell.Edge;
import Metamodell.Facet;
import Metamodell.MetamodellFactory;
import Metamodell.MetamodellPackage;
import Metamodell.Vector3f;
import Metamodell.impl.ColorImpl;
import Metamodell.impl.FacetImpl;
import Metamodell.impl.MetamodellFactoryImpl;
import Metamodell.impl.MetamodellPackageImpl;
import Metamodell.impl.SolidImpl;
import controller.Controller;

public class Parser
{
	
	private static SYNC sync;
	
	private static void initialiseFwdSynchroniser() throws IOException
	{
		if (sync != null)
		{
			sync.terminate();
		}
		sync = new INITIAL_FWD_App();
		sync.setUpdatePolicy(matches -> {
			IMatch rule = null;
			Set<IMatch> _matches_ = matches.getMatches();
			// System.out.println(_matches_.size());
			for (IMatch m : _matches_)
			{
//				if (m.getRuleName().equals("EdgeRule8"))
//				{ 
//					//System.out.println(m);
//					return m;
//				}
				if (m.getRuleName().equals("SolidRule"))
				{
					// System.out.println(m);
					return m;
				}
//				if (m.getRuleName().equals("EdgeRule2") || m.getRuleName().equals("EdgeRule3") || m.getRuleName().equals("EdgeRule4"))
//				{
//					if (rule == null || (!rule.getRuleName().equals("EdgeRule5") && !rule.getRuleName().equals("EdgeRule6") && !rule.getRuleName().equals("EdgeRule7")))
//					{
//						
//						rule = m;
//					}
//				}
//				if (m.getRuleName().equals("EdgeRule5") || m.getRuleName().equals("EdgeRule6") || m.getRuleName().equals("EdgeRule7"))
//				{	
//			
//					rule = m;
//				}
				if (m.getRuleName().equals("VectorRule2"))
				{
					// System.out.println(m);
					return m;
				}
			}
//			if (rule != null)
//			{	
//				//System.out.println(rule);
//				return rule;
//			}
			// System.out.println(matches.getNext());
			return matches.getNext();
		});
	}
	
	private void initialiseBwdSynchroniser() throws IOException
	{
		if (sync == null)
		{
			sync = new SYNC_App();
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		
		RunParser stlParser = new RunParser("Cube.stl");
		Optional<Solid> s = stlParser.parse();
		s.ifPresent(b -> {
			try
			{
//				Controller ctrl = new Controller();
//				System.out.println(1);
				
				initialiseFwdSynchroniser();
//				System.out.println(2);
				sync.getSourceResource().getContents().add(b);
				// System.out.println(b.getFacets().size());
//				System.out.println(3);
				// System.out.println(sync.getSourceResource().getContents());
				sync.forward();
//				System.out.println(4);
				// System.out.println(sync.getTargetResource().getContents());
				sync.saveModels();
				System.out.println(sync.getTargetResource().getContents());
				Metamodell.Solid solid = (Metamodell.Solid) sync.getTargetResource().getContents().get(0);
				
				computeDegrees((SolidImpl) solid, false);
				mergeNormals((SolidImpl) solid);
		
//				printSolid((SolidImpl) solid);
		
//				 MetamodellFactory f = new MetamodellFactoryImpl();
//				 Color c = f.createColor();
//				 c.setR(0);
//				 c.setG(40);
//				 c.setB(0);
//						
//				 solid.getFacets().get(0).eSetDeliver(false);
//				 solid.getFacets().get(0).setColor(c);
//				
//				 Color c2 = f.createColor();
//				 c2.setR(40);
//				 c2.setG(0);
//				 c2.setB(0);
//				 solid.getFacets().get(3).eSetDeliver(false);
//				 solid.getFacets().get(3).setColor(c2);
				
				// ctrl.createAreas(solid);
				// System.out.println(solid.getArea());
				STLRules rules = new STLRules(solid);
				rules.validateSolid(solid);
				
				RunSerialiser rSerialiser = new RunSerialiser();
				
				rSerialiser.unparse("example.stl", solid);
				
				// System.out.println("Matches: " + rules.validateSolid(solid));
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		});
	}
	
	private static void mergeNormals(SolidImpl solid)
	{
		final float EPSILON = 0.0000001f;
		for (Facet f1 : solid.getFacets())
		{
			Vector3f n1 = f1.getNormal();
			for (Facet f2 : solid.getFacets())
			{
				Vector3f n2 = f2.getNormal();
				if (f1 == f2 || Math.abs(n1.getX() - n2.getX()) > EPSILON || Math.abs(n1.getY() - n2.getY()) > EPSILON || Math.abs(n1.getZ() - n2.getZ()) > EPSILON)
				{
					continue;
				}
				f2.setNormal(n1);
			}
		}
	}
	
	private static void computeDegrees(final SolidImpl solid, final boolean debug)
	{
		for (Facet f : solid.getFacets())
		{
			for (Edge e : f.getEdges())
			{
				Controller.computeDegree(e, debug);
			}
		}
	}
	
	private static void printSolid(final SolidImpl solid)
	{
		System.out.println("Facets: " + solid.getFacets().size());
		for (Facet f : solid.getFacets())
		{
			System.out.println("Facet: " + f);
			System.out.println("\tSolid: " + f.getSolid());
			System.out.println("\tColor: " + f.getColor());
			System.out.println("\tNormal: " + vectorToString(f.getNormal()));
			System.out.println("\tEdges:");
			for (Edge e : f.getEdges())
			{
				for (Vector3f v : e.getP())
				{
					System.out.println("\t\t" + vectorToString(v));
				}
			}
			System.out.println("\tVector " + vectorToString(f.getX()));
			System.out.println("\tVector " + vectorToString(f.getY()));
			System.out.println("\tVector " + vectorToString(f.getZ()));
		}
	}
	
	private static String vectorToString(final Vector3f normal)
	{
		return normal.getX() + ", " + normal.getY() + ", " + normal.getZ();
	}
}
