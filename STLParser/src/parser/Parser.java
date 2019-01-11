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
					//System.out.println(m);
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
					//System.out.println(m);
					return m;
				}
			}
//			if (rule != null)
//			{	
//				//System.out.println(rule);
//				return rule;
//			}
			//System.out.println(matches.getNext());
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
	
		RunParser stlParser = new RunParser("test.stl");
		Optional<Solid> s = stlParser.parse();
		s.ifPresent(b -> {
			try
			{
				Controller ctrl = new Controller();
				System.out.println(1);
				
				initialiseFwdSynchroniser();
				System.out.println(2);
				sync.getSourceResource().getContents().add(b);
				// System.out.println(b.getFacets().size());
				System.out.println(3);
				// System.out.println(sync.getSourceResource().getContents());
				sync.forward();
				System.out.println(4);
				// System.out.println(sync.getTargetResource().getContents());
				sync.saveModels();
				System.out.println(sync.getTargetResource().getContents());
				Metamodell.Solid solid =  (Metamodell.Solid) sync.getTargetResource().getContents().get(0);
		
				printSolid((SolidImpl) solid);
				System.out.println(solid.getFacets().get(0).getEdges().get(0).getP());
				System.out.println(solid.getFacets().get(0).getEdges().get(0).getF());
				System.out.println(solid.getFacets().get(0).getEdges().get(1).getP());
				System.out.println(solid.getFacets().get(0).getEdges().get(1).getF());
				System.out.println(solid.getFacets().get(0).getEdges().get(2).getP());
				System.out.println(solid.getFacets().get(0).getEdges().get(2).getF());
				System.out.println("-----------------------------------------------");
				System.out.println(solid.getFacets().get(1).getEdges().get(0).getP());
				System.out.println(solid.getFacets().get(1).getEdges().get(0).getF());
				System.out.println(solid.getFacets().get(1).getEdges().get(1).getP());
				System.out.println(solid.getFacets().get(1).getEdges().get(1).getF());
				System.out.println(solid.getFacets().get(1).getEdges().get(2).getP());
				System.out.println(solid.getFacets().get(1).getEdges().get(2).getF());
				System.out.println("-----------------------------------------------");
				System.out.println(solid.getFacets().get(2).getEdges().get(0).getP());
				System.out.println(solid.getFacets().get(2).getEdges().get(0).getF());
				System.out.println(solid.getFacets().get(2).getEdges().get(1).getP());
				System.out.println(solid.getFacets().get(2).getEdges().get(1).getF());
				System.out.println(solid.getFacets().get(2).getEdges().get(2).getP());
				System.out.println(solid.getFacets().get(2).getEdges().get(2).getF());
				System.out.println("-----------------------------------------------");
				System.out.println(solid.getFacets().get(3).getEdges().get(0).getP());
				System.out.println(solid.getFacets().get(3).getEdges().get(0).getF());
				System.out.println(solid.getFacets().get(3).getEdges().get(1).getP());
				System.out.println(solid.getFacets().get(3).getEdges().get(1).getF());
				System.out.println(solid.getFacets().get(3).getEdges().get(2).getP());
				System.out.println(solid.getFacets().get(3).getEdges().get(2).getF());
				
//				 MetamodellFactory f = new MetamodellFactoryImpl();
//				 Color c = f.createColor();
//				 Vector3f v = f.createVector3f();
//				 c.setR(30);
//				 c.setG(20);
//				 c.setB(20);
//				 Facet fac = (FacetImpl) f.createFacet();
//				 fac.setColor(c);
//				
//				 solid.getFacets().get(0).eSetDeliver(false);
//				 solid.getFacets().get(0).setColor(c);
				

	
				ctrl.createAreas(solid);
				System.out.println(solid.getArea());
				STLRules rules = new STLRules(solid);
				rules.validateSolid(solid);			

				RunSerialiser rSerialiser = new RunSerialiser();
				// rSerialiser.unparse("example.bin", solid);
				
				//System.out.println("Matches: " + rules.validateSolid(solid));
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		});
	}
	
	private static String toString(final Vector3f vec)
	{
		return "<Vector>" + vec.getX() + ", " + vec.getY() + ", " + vec.getZ() + "</Vector>";
	}
	
	private static String toString(final Edge edge)
	{
		String result = "<Edge>";
		for(Vector3f v : edge.getP())
		{
			result += toString(v);
		}
		return result + "</Edge>";
	}
	
	private static void printSolid(final SolidImpl solid)
	{
		try
		{
			System.out.println("Facets: " + solid.getFacets().size());
			for (Facet f : solid.getFacets())
			{
				System.out.println("Facet: " + f);
				System.out.println("\tSolid: " + f.getSolid());
				System.out.println("\tColor: " + f.getColor());
				System.out.println("\tNormal: " + f.getNormal());
				System.out.println("\tEdge");
				
				for (Edge e : f.getEdges())
				{
					Controller ctrl = new Controller();
					ctrl.computeDegree(e);
					System.out.println("\t\t" + toString(e));
				}
			}
//			System.out.println(solid.getFacets().get(0).getEdges().get(0).getP());
//			System.out.println(solid.getFacets().get(0).getEdges().get(0).getF());
//			System.out.println(solid.getFacets().get(0).getEdges().get(1).getP());
//			System.out.println(solid.getFacets().get(0).getEdges().get(1).getF());
//			System.out.println(solid.getFacets().get(0).getEdges().get(2).getP());
//			System.out.println(solid.getFacets().get(0).getEdges().get(2).getF());
//			System.out.println("-----------------------------------------------");
//			System.out.println(solid.getFacets().get(1).getEdges().get(0).getP());
//			System.out.println(solid.getFacets().get(1).getEdges().get(0).getF());
//			System.out.println(solid.getFacets().get(1).getEdges().get(1).getP());
//			System.out.println(solid.getFacets().get(1).getEdges().get(1).getF());
//			System.out.println(solid.getFacets().get(1).getEdges().get(2).getP());
//			System.out.println(solid.getFacets().get(1).getEdges().get(2).getF());
//			System.out.println("-----------------------------------------------");
//			System.out.println(solid.getFacets().get(2).getEdges().get(0).getP());
//			System.out.println(solid.getFacets().get(2).getEdges().get(0).getF());
//			System.out.println(solid.getFacets().get(2).getEdges().get(1).getP());
//			System.out.println(solid.getFacets().get(2).getEdges().get(1).getF());
//			System.out.println(solid.getFacets().get(2).getEdges().get(2).getP());
//			System.out.println(solid.getFacets().get(2).getEdges().get(2).getF());
//			System.out.println("-----------------------------------------------");
//			System.out.println(solid.getFacets().get(3).getEdges().get(0).getP());
//			System.out.println(solid.getFacets().get(3).getEdges().get(0).getF());
//			System.out.println(solid.getFacets().get(3).getEdges().get(1).getP());
//			System.out.println(solid.getFacets().get(3).getEdges().get(1).getF());
//			System.out.println(solid.getFacets().get(3).getEdges().get(2).getP());
//			System.out.println(solid.getFacets().get(3).getEdges().get(2).getF());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
