package org.xtext.example.mydsl.rules;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import org.xtext.example.mydsl.rules.api.RulesAPI;
import org.xtext.example.mydsl.rules.api.matches.AreaMatch;
import org.xtext.example.mydsl.rules.api.matches.DegreeMatch;

import Metamodell.Area;
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
	
	public long validateSolid(Solid solid)
	{
		MetamodellFactory factory = new MetamodellFactoryImpl();
		System.out.println("exPattern: " + api.exPattern().countMatches());
		System.out.println("examplePattern: " + api.examplePattern().countMatches());
		System.out.println("degree: " + api.degree().countMatches());
		System.out.println("facets: " + api.facet().countMatches());
		System.out.println("areas: " + api.area().countMatches());
		
		/*
		 * Beispiel zur Orientierung ähnliches Vorgehen bei euren neuen Pattern. 1. Erstelle sinnvolles Pattern: z.B anhand der uns vorliegenden Pdfs Füge ggf. neue Klassen dem Metamodell oder neue Attribute hinzu die ihr dann setzt und berechnet (vgl. Beispiel Area) (z.B Abstand gegenüberliegender Facets etc.) 2. Erstelle das Pattern in Rules.gt 3. Finde alle Matches und setze für jedes Pattern, eine ausgewählte Farbe für die Facets, die von der Regel betroffen sind
		 * 
		 * Beispiel degree: Alle Facets deren Winkel größer als 90 Grad ist werden hier rot gefärbt (R G und B werte zwischen 0 und 31 (5) bits) Bitte eure Methoden zu den Regeln wie hier ( Alle Facets deren Winkel größer als 90 Grad ist werden hier rot gefärbt ) kommentieren, damit ich noch ein xtend template erstellen kann, dass quasi als Legende funktioniert und Farbe und Pattern beschreibt damit wir xtend auch benutzt haben.
		 * 
		 */
		
		if (api.area().hasMatches())
		{
			Collection<AreaMatch> matches = api.area().findMatches();
			HashMap<Facet, HashSet<Facet>> unions = new HashMap<Facet, HashSet<Facet>>();
			for(AreaMatch m : matches)
			{
				HashSet<Facet> setA = unions.get(m.getFA());
				HashSet<Facet> setB = unions.get(m.getFB());
				if(setA == null && setB == null)
				{
					HashSet<Facet> hs = new HashSet<Facet>();
					hs.add(m.getFA());
					hs.add(m.getFB());
					unions.put(m.getFA(), hs);
					unions.put(m.getFB(), hs);
				}
				else if(setA == null && setB != null)
				{
					setB.add(m.getFA());
					unions.put(m.getFA(), setB);
				}
				else if(setA != null && setB == null)
				{
					setA.add(m.getFB());
					unions.put(m.getFB(), setA);
				}
				else 
				{
					setA.addAll(setB);
					for(Facet f2 : setB)
					{
						unions.put(f2, setA);
					}
				}
			}
			HashSet<HashSet<Facet>> areas = new HashSet<HashSet<Facet>>();
			areas.addAll(unions.values());
			Random r = new Random();
			for(HashSet<Facet> area : areas)
			{
				Color c = factory.createColor();
				c.setR(r.nextInt(32));
				c.setG(r.nextInt(32));
				c.setB(r.nextInt(32));
				for(Facet face : area)
				{
					face.eSetDeliver(false);
					face.setColor(c);
				}
			}
		}
		
		if (api.degree().hasMatches())
		{
			Collection<DegreeMatch> matches = api.degree().findMatches();
			for (DegreeMatch m : matches)
			{
				Color c = factory.createColor();
				c.setR(31);
				c.setG(0);
				c.setB(0);
				
				m.getE().getF().get(0).eSetDeliver(false);
				m.getE().getF().get(0).setColor(c);
				m.getE().getF().get(1).eSetDeliver(false);
				m.getE().getF().get(1).setColor(c);
			}
		}
		
		return api.examplePattern().countMatches();
	}
}
