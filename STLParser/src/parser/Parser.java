package parser;

import java.io.IOException;
import java.util.Optional;
import java.util.Set;

import org.emoflon.ibex.tgg.operational.matches.IMatch;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.stlimportexport.INITIAL_FWD_App;
import org.emoflon.ibex.tgg.run.stlimportexport.SYNC_App;
import org.xtext.example.mydsl.api.RunParser;
import org.xtext.example.mydsl.myDsl.Solid;

import Metamodell.Edge;
import Metamodell.Facet;
import Metamodell.impl.SolidImpl;
import controller.Controller;

public class Parser
{
	
	private static SYNC sync;
	
	private static void initialiseFwdSynchroniser() throws IOException
	{
		if (sync != null)
			sync.terminate();
		
		System.out.println("SYNC_App create");
		sync = new INITIAL_FWD_App();
		System.out.println("SYNC_App created");
		sync.setUpdatePolicy(matches -> 
		{
			IMatch rule = null;
			Set<IMatch> _matches_ = matches.getMatches();
			System.out.println("Matches: " + _matches_.size());
			for (IMatch m : _matches_)
			{
				
				if(m.getRuleName().equals("EdgeRule8"))
					return m;
				
				if (m.getRuleName().equals("SolidRule"))
					return m;
				
				if ( m.getRuleName().equals("EdgeRule2") || m.getRuleName().equals("EdgeRule3") || m.getRuleName().equals("EdgeRule4")) 
				{
					if(rule == null || (!rule.getRuleName().equals("EdgeRule5") && !rule.getRuleName().equals("EdgeRule6") && !rule.getRuleName().equals("EdgeRule7")))
					rule = m;
				}
				
				if ( m.getRuleName().equals("EdgeRule5") || m.getRuleName().equals("EdgeRule6") || m.getRuleName().equals("EdgeRule7"))
				{
					
					rule = m;
				}
				
				
				if (m.getRuleName().equals("VectorRule2"))
				{
					System.out.println(m);
					return m;
				}
				
			}
			if(rule != null)
				return rule;
			return matches.getNext();
		});
	}
	
	private void initialiseBwdSynchroniser() throws IOException
	{
		if (sync == null)
			sync = new SYNC_App();
	}
	
	public static void main(String[] args) throws IOException
	{
		RunParser stlParser = new RunParser("test.stl");
		Optional<Solid> s = stlParser.parse();
		System.out.println("-1");
		s.ifPresent(b -> {
			try
			{
				System.out.println("0");
				initialiseFwdSynchroniser();
				System.out.println("1");
				sync.getSourceResource().getContents().add(b);
				// System.out.println(sync.getSourceResource().getContents());
				System.out.println("2");
				sync.forward();
				System.out.println("3");
				// System.out.println(sync.getTargetResource().getContents());
				sync.saveModels();
				System.out.println("4");
				System.out.println(sync.getTargetResource().getContents());
				Metamodell.Solid solid = (Metamodell.Solid) sync.getTargetResource().getContents().get(0);
				System.out.println("5");
//				System.out.println(solid.getFacets().get(0).getEdges().get(0).getP());
//				System.out.println(solid.getFacets().get(0).getEdges().get(0).getF());
//				System.out.println(solid.getFacets().get(0).getEdges().get(1).getP());
//				System.out.println(solid.getFacets().get(0).getEdges().get(1).getF());
//				System.out.println(solid.getFacets().get(0).getEdges().get(2).getP());
//				System.out.println(solid.getFacets().get(0).getEdges().get(2).getF());
//				System.out.println("-----------------------------------------------");
//				System.out.println(solid.getFacets().get(1).getEdges().get(0).getP());
//				System.out.println(solid.getFacets().get(1).getEdges().get(0).getF());
//				System.out.println(solid.getFacets().get(1).getEdges().get(1).getP());
//				System.out.println(solid.getFacets().get(1).getEdges().get(1).getF());
//				System.out.println(solid.getFacets().get(1).getEdges().get(2).getP());
//				System.out.println(solid.getFacets().get(1).getEdges().get(2).getF());
//				System.out.println("-----------------------------------------------");
//				System.out.println(solid.getFacets().get(2).getEdges().get(0).getP());
//				System.out.println(solid.getFacets().get(2).getEdges().get(0).getF());
//				System.out.println(solid.getFacets().get(2).getEdges().get(1).getP());
//				System.out.println(solid.getFacets().get(2).getEdges().get(1).getF());
//				System.out.println(solid.getFacets().get(2).getEdges().get(2).getP());
//				System.out.println(solid.getFacets().get(2).getEdges().get(2).getF());
//				System.out.println("-----------------------------------------------");
//				System.out.println(solid.getFacets().get(3).getEdges().get(0).getP());
//				System.out.println(solid.getFacets().get(3).getEdges().get(0).getF());
//				System.out.println(solid.getFacets().get(3).getEdges().get(1).getP());
//				System.out.println(solid.getFacets().get(3).getEdges().get(1).getF());
//				System.out.println(solid.getFacets().get(3).getEdges().get(2).getP());
//				System.out.println(solid.getFacets().get(3).getEdges().get(2).getF());
				Controller ctrl = new Controller();
//				System.out.println("<computeDegree>");
//				for (Facet face : solid.getFacets())
//				{
//					for (Edge e : face.getEdges())
//					{
//						ctrl.computeDegree(e);
//					}
//				}
//				System.out.println("</computeDegree>");
				System.out.println("<createAreas>");
				ctrl.createAreas(solid);
				System.out.println("</createAreas>");
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		);
	}
}
