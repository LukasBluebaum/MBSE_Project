package org.xtext.example.mydsl.rules;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

import org.xtext.example.mydsl.rules.api.RulesAPI;
import org.xtext.example.mydsl.rules.api.matches.AreaMatch;
import org.xtext.example.mydsl.rules.api.matches.DegreeMatch;

import Metamodell.Color;
import Metamodell.Facet;
import Metamodell.MetamodellFactory;
import Metamodell.Solid;
import Metamodell.impl.MetamodellFactoryImpl;

public class STLRules
{
	private RulesAPI api;
	
	public STLRules(Solid solid)
	{
		api = new Validator(solid).initAPI();
	}
	
	public void validateSolid(Solid solid)
	{
		MetamodellFactory factory = new MetamodellFactoryImpl();
		System.out.println(getClass().getSimpleName() + ".validateSolid(Solid)");
		System.out.println("\tFacets: " + api.facet().countMatches());
		System.out.println("\tVertices: " + api.vertex().countMatches());
		System.out.println("\tEdges: " + api.edge().countMatches());
		System.out.println("\tNormals: " + api.normal().countMatches());
		System.out.println("\tEdges with at least 90 degrees: " + api.degree().countMatches());
		System.out.println("\tPairs of Facets with equal normals: " + api.area().countMatches());
				
		if (api.area().hasMatches())
		{
			Collection<AreaMatch> matches = api.area().findMatches();
			colorAreas(matches, factory);
		}
		
		if (api.degree().hasMatches())
		{
			Collection<DegreeMatch> matches = api.degree().findMatches();
			colorEdges(matches, factory);
		}
	}
		
	private void colorAreas(final Collection<AreaMatch> matches, final MetamodellFactory factory)
	{
		HashMap<Facet, HashSet<Facet>> unions = new HashMap<Facet, HashSet<Facet>>();
		for (AreaMatch m : matches)
		{
			HashSet<Facet> setA = unions.get(m.getFA());
			HashSet<Facet> setB = unions.get(m.getFB());
			if (setA == null && setB == null) /* Beide Facets gehören noch zu keiner Area */
			{
				// Erzeuge neue Area für die beiden Facets
				HashSet<Facet> hs = new HashSet<Facet>();
				hs.add(m.getFA());
				hs.add(m.getFB());
				// Beide Facets zeigen auf die selbe Area
				unions.put(m.getFA(), hs);
				unions.put(m.getFB(), hs);
			}
			else if (setA == null && setB != null) /* Facet B gehört zu einer Area */
			{
				// Füge Facet A in die Area ein
				setB.add(m.getFA());
				// Facet A zeigt auf die Area
				unions.put(m.getFA(), setB);
			}
			else if (setA != null && setB == null) /* Facet A gehört zu einer Area */
			{
				// Füge Facet B in die Area ein
				setA.add(m.getFB());
				// Facet B zeigt auf die Area
				unions.put(m.getFB(), setA);
			}
			else /* Beide Facets gehören zu einer Area */
			{
				// Fasse die Areas zusammen
				setA.addAll(setB);
				for (Facet f2 : setB)
				{
					unions.put(f2, setA);
				}
			}
		}
		// Das HashSet hilft dabei mehrfach vorkommende Referenzen auf die gleiche Area zu entfernen
		HashSet<HashSet<Facet>> areas = new HashSet<HashSet<Facet>>();
		areas.addAll(unions.values());
		Random r = new Random();
		// Färbe alle Areas mit einer zufällig gewählten Farbe
		for (HashSet<Facet> area : areas)
		{
			Color c = factory.createColor();
			c.setR(r.nextInt(32));
			c.setG(r.nextInt(32));
			c.setB(r.nextInt(32));
			for (Facet face : area)
			{
				face.eSetDeliver(false);
				face.setColor(c);
			}
		}
	}
	
	private void colorEdges(final Collection<DegreeMatch> matches, final MetamodellFactory factory)
	{
		// Farbe "Rot" erzeugen
		Color red = factory.createColor();
		red.setR(31);
		red.setG(0);
		red.setB(0);
		// Alle Matches einfärben
		for (DegreeMatch m : matches)
		{
			m.getE().getF().get(0).eSetDeliver(false);
			m.getE().getF().get(0).setColor(red);
			m.getE().getF().get(1).eSetDeliver(false);
			m.getE().getF().get(1).setColor(red);
		}
	}
	
}
