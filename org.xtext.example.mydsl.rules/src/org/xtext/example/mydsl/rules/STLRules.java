package org.xtext.example.mydsl.rules;

import java.util.Collection;

import org.xtext.example.mydsl.rules.api.RulesAPI;
import org.xtext.example.mydsl.rules.api.matches.DegreeMatch;

import Metamodell.Color;
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
		MetamodellFactory f = new MetamodellFactoryImpl();
		System.out.println("exPattern: "+api.exPattern().countMatches());
		System.out.println("examplePattern: "+api.examplePattern().countMatches());
		System.out.println("degree: "+api.degree().countMatches());
	
		/*	Beispiel zur Orientierung ähnliches Vorgehen bei euren neuen Pattern.
		 *  1.	Erstelle sinnvolles Pattern: z.B anhand der uns vorliegenden Pdfs 
		 * 		Füge ggf. neue Klassen dem Metamodell oder neue Attribute hinzu die ihr dann setzt und berechnet (vgl. Beispiel Area)
		 * 		(z.B Abstand gegenüberliegender Facets etc.)
		 *  2. 	Erstelle das Pattern in Rules.gt
		 *  3. 	Finde alle Matches und setze für jedes Pattern, eine ausgewählte Farbe für die Facets, die von der Regel betroffen sind
		 *  
		 *  Beispiel degree: Alle Facets deren Winkel größer als 90 Grad ist werden hier rot gefärbt (R G und B werte zwischen 0 und 31 (5) bits)
		 *  Bitte eure Methoden zu den Regeln wie hier ( Alle Facets deren Winkel größer als 90 Grad ist werden hier rot gefärbt ) kommentieren,
		 *  damit ich noch ein xtend template erstellen kann, dass quasi als Legende funktioniert und Farbe und Pattern beschreibt damit wir xtend auch benutzt haben.
		 * 
		 */
		
		
		if(api.degree().hasMatches())
		{
		 Collection<DegreeMatch> matches = api.degree().findMatches();
		 	for(DegreeMatch m: matches) {
		 		Color c = f.createColor();
				 c.setR(31);
				 c.setG(0);
				 c.setB(0);
				
				 m.getE().getF().get(0).eSetDeliver(false);
		 		 m.getE().getF().get(0).setColor(c);
		 		 m.getE().getF().get(0).eSetDeliver(false);
		 		 m.getE().getF().get(0).setColor(c);
		 	}
		}
		
		return api.examplePattern().countMatches();
	}
}
