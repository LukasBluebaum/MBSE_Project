package org.xtext.example.mydsl.serialiser

import Metamodell.Solid

class Serialiser {
	
	static def String serialise(Solid s){
		'''
		COLOR=«ByteConverter.intToByte(s.getFacets().size)»	
		'''
	}
	
}