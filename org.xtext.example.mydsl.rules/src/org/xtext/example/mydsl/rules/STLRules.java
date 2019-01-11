package org.xtext.example.mydsl.rules;

import org.xtext.example.mydsl.rules.api.RulesAPI;

import Metamodell.Solid;

public class STLRules
{
	private RulesAPI api;
	
	public STLRules(Solid solid)
	{
		api = new Validator(solid).initAPI();
	}
		
	public long validateSolid(Solid solid)
	{
		System.out.println("exPattern: "+api.exPattern().countMatches());
		System.out.println("examplePattern: "+api.examplePattern().countMatches());
		System.out.println("degree: "+api.degree().countMatches());
				
		return api.examplePattern().countMatches();
	}
}
