package org.xtext.example.mydsl.serialiser;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Base64;

import Metamodell.Edge;
import Metamodell.Facet;
import Metamodell.MetamodellFactory;
import Metamodell.Vector3f;
import Metamodell.impl.FacetImpl;
import Metamodell.impl.MetamodellFactoryImpl;
import Metamodell.Color;

public class ByteConverter {
 public static void main(String[] args) throws UnsupportedEncodingException 	{
	
	 MetamodellFactory f = new MetamodellFactoryImpl();
	 Color c = f.createColor();
	 c.setR(30);
	 c.setG(20);
	 c.setB(20);
	 FacetImpl fac = (FacetImpl) f.createFacet();
	 fac.setColor(c);
	 System.out.println(fac.getColor());
	 createColorBits(c);
 }
 
 
public static String intToByte(int n) {
		ByteBuffer bb = ByteBuffer.allocate(4);
		bb.order(ByteOrder.LITTLE_ENDIAN);
		bb.putInt(n);
		return new String(bb.array());
}


public static String shortToByte(short n) {
	ByteBuffer bb = ByteBuffer.allocate(2);
	bb.order(ByteOrder.LITTLE_ENDIAN);
	bb.putShort(n);
	return new String(bb.array());
}

public static String floatToByte(float n) {
	ByteBuffer bb = ByteBuffer.allocate(4);
	bb.order(ByteOrder.LITTLE_ENDIAN);
	bb.putFloat(n);
	return new String(bb.array());
}

public static ArrayList<Vector3f> getVectors(Facet f) {
	ArrayList<Vector3f> vec = new ArrayList<Vector3f>();
	for(Edge e : f.getEdges()) {
		if(!vec.contains(e.getP().get(0))) {
			vec.add(e.getP().get(0));
		}
		if(!vec.contains(e.getP().get(1))) {
			vec.add(e.getP().get(1));
		}
	}
	System.out.println(vec);
	
	
	return vec;
	
}


public static String createColorBits(Color color) {
		
	int x = (color.getG() << 5) | color.getR();
	int y = ((color.getB() << 10) | x) ;
    System.out.println(Integer.toBinaryString(y));
	ByteBuffer bb = ByteBuffer.allocate(2);
	bb.order(ByteOrder.LITTLE_ENDIAN);
	bb.putShort((short) y);
	return new String(bb.array());
	
}
 
}
