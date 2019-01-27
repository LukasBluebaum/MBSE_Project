package org.xtext.example.mydsl.rules;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.xtext.example.mydsl.rules.api.RulesDemoclesApp;

import Metamodell.Edge;
import Metamodell.Facet;
import Metamodell.Solid;

public class Validator extends RulesDemoclesApp
{
	
	public Validator(Solid solid)
	{
		// Determine the path to the workspace root for loading models
		File root = new File(Validator.class.getResource(".").getFile());
		workspacePath = root.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getParent() + File.separatorChar;
		// Add the board as a model to be monitored by the pattern matcher
		createModel(URI.createURI("gt-rules.xmi"));
		// createModel(URI.createURI("solid.xmi"));
		
//		System.out.println(getClass().getSimpleName() + ": " + resourceSet.getResources());
		resourceSet.getResources().get(0).getContents().add(solid);
//		System.out.println(getClass().getSimpleName() + ": " + resourceSet.getResources().get(0).getContents());
		
		for (Facet facet : solid.getFacets())
		{
			for (Edge edge : facet.getEdges())
			{
				resourceSet.getResources().get(0).getContents().add(edge);
			}
		}
	}
}
