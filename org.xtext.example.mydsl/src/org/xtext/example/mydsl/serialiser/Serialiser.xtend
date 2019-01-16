package org.xtext.example.mydsl.serialiser

import Metamodell.Solid

class Serialiser {
	
	static def String serialise(Solid s){
		'''
		COLOR=«ByteConverter.setBytes(127,127,127,32)»MATERIAL=«ByteConverter.setBytes(127,127,127,32)»«ByteConverter.setBytes(127,127,127,32)»«ByteConverter.setBytes(127,127,127,32)»                                                 «ByteConverter.intToByte(s.getFacets().size)»«
		»«FOR f : s.getFacets()»«
		»«ByteConverter.floatToByte(f.getNormal().getX(), f.getNormal().getY() , f.getNormal().getZ() ) +
		ByteConverter.floatToByte(ByteConverter.getVectors(f).get(0).getX() , ByteConverter.getVectors(f).get(0).getY() , ByteConverter.getVectors(f).get(0).getZ()) +
		ByteConverter.floatToByte(ByteConverter.getVectors(f).get(1).getX() , ByteConverter.getVectors(f).get(1).getY() , ByteConverter.getVectors(f).get(1).getZ()) +
		ByteConverter.floatToByte(ByteConverter.getVectors(f).get(2).getX() , ByteConverter.getVectors(f).get(2).getY() , ByteConverter.getVectors(f).get(2).getZ())»«
		»«IF f.getColor() !== null»«ByteConverter.createColorBits(f.getColor())»«ELSE»«ByteConverter.shortToByte(0)»«ENDIF»«ENDFOR»'''
		
	}
	
	
		static def String serialise2(Solid s){
		'''
		COLOR=«ByteConverter.setBytes(127,127,127,32)»MATERIAL=«ByteConverter.setBytes(127,127,127,32)»«ByteConverter.setBytes(127,127,127,32)»«ByteConverter.setBytes(127,127,127,32)»                                                 «ByteConverter.intToByte(s.getFacets().size)»«
		»«FOR f : s.getFacets()»«ByteConverter.createBinary(f)»«ENDFOR»'''
		
	}
	
}




/*
 * 		«ByteConverter.floatToByte(f.getNormal().getX())»
		«ByteConverter.floatToByte(f.getNormal().getY())»
		«ByteConverter.floatToByte(f.getNormal().getZ())»
		«ByteConverter.floatToByte(f.getNormal().getX())»
		«ByteConverter.floatToByte(f.getNormal().getY())»
		«ByteConverter.floatToByte(f.getNormal().getZ())»
		«ByteConverter.floatToByte(ByteConverter.getVectors(f).get(0).getX())»
		«ByteConverter.floatToByte(ByteConverter.getVectors(f).get(0).getY())»
		«ByteConverter.floatToByte(ByteConverter.getVectors(f).get(0).getZ())»
		«ByteConverter.floatToByte(ByteConverter.getVectors(f).get(1).getX())»
		«ByteConverter.floatToByte(ByteConverter.getVectors(f).get(1).getY())»
		«ByteConverter.floatToByte(ByteConverter.getVectors(f).get(1).getZ())»
		«ByteConverter.floatToByte(ByteConverter.getVectors(f).get(2).getX())»
		«ByteConverter.floatToByte(ByteConverter.getVectors(f).get(2).getY())»
		«ByteConverter.floatToByte(ByteConverter.getVectors(f).get(2).getZ())»
 */