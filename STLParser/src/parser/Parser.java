package parser;

import java.io.IOException;
import java.util.Optional;

import org.emoflon.ibex.tgg.operational.matches.IMatch;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
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
		
		sync = new SYNC_App();
		sync.setUpdatePolicy(matches -> {
			for (IMatch m : matches.getMatches())
			{
				if (m.getRuleName().equals("SolidRule"))
					
					return m;
				
				if (m.getRuleName().equals("EdgeRule2"))
				{
					System.out.println(m);
					return m;
				}
				
				if (m.getRuleName().equals("VectorRule2"))
				{
					System.out.println(m);
					return m;
				}
				
			}
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
		
		s.ifPresent(b -> {
			try
			{
				initialiseFwdSynchroniser();
				
				sync.getSourceResource().getContents().add(b);
				// System.out.println(sync.getSourceResource().getContents());
				
				sync.forward();
				// System.out.println(sync.getTargetResource().getContents());
				sync.saveModels();
				System.out.println(sync.getTargetResource().getContents());
				Metamodell.Solid solid = (Metamodell.Solid) sync.getTargetResource().getContents().get(0);
				
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
				
				Controller ctrl = new Controller();
				System.out.println("<computeDegree>");
				for (Facet face : solid.getFacets())
				{
					for (Edge e : face.getEdges())
					{
						ctrl.computeDegree(e);
					}
				}
				System.out.println("</computeDegree>");
				System.out.println("<createAreas>");
//				ctrl.createAreas(solid);
				System.out.println("</createAreas>");
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		});
	}
}
