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
		return api.examplePattern().countMatches();
	}
}
