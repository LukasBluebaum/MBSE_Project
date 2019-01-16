package org.xtext.example.mydsl.serialiser;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;

import Metamodell.Edge;
import Metamodell.Facet;
import Metamodell.MetamodellFactory;
import Metamodell.Vector3f;
import Metamodell.impl.FacetImpl;
import Metamodell.impl.MetamodellFactoryImpl;
import Metamodell.Color;
import Metamodell.Solid;

public class ByteConverter {
 public static void main(String[] args) throws UnsupportedEncodingException 	{
	
	 MetamodellFactory f = new MetamodellFactoryImpl();
	 Color c = f.createColor();
	 c.setR(30);
	 c.setG(20);
	 c.setB(20);
	 FacetImpl fac = (FacetImpl) f.createFacet();
	 fac.setColor(c);
	 createColorBits(c);
 }
 
 
public static String setBytes(int a, int b, int c, int d) {
	ByteBuffer bb = ByteBuffer.allocate(4);
	bb.order(ByteOrder.LITTLE_ENDIAN);
	bb.put((byte) a);
	bb.put((byte) b);
	bb.put((byte) c);
	bb.put((byte) d);
	return new String(bb.array());
}
 
public static String intToByte(int n) {
		ByteBuffer bb = ByteBuffer.allocate(4);
		bb.order(ByteOrder.LITTLE_ENDIAN);
		bb.putInt(n);
		return new String(bb.array());
}


public static String shortToByte(int n) {
	ByteBuffer bb = ByteBuffer.allocate(2);
	bb.order(ByteOrder.LITTLE_ENDIAN);
	bb.put((byte) 0);
	bb.put((byte) n);
	return new String(bb.array());
}

public static String floatToByte2(float n) {
	ByteBuffer bb = ByteBuffer.allocate(4);
	bb.order(ByteOrder.LITTLE_ENDIAN);
	bb.putFloat(n);
	return new String(bb.array());
}

public static String floatToByte(float x, float y, float z) {
	ByteBuffer bb = ByteBuffer.allocate(12);
	bb.order(ByteOrder.LITTLE_ENDIAN);
	bb.putFloat(x).putFloat(y).putFloat(z);
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

	
	
	return vec;
	
}


public static String createColorBits(Color color) {
		
	int x = (color.getG() << 5) | color.getR();
	int y = ((color.getB() << 10) | x) ;
   	ByteBuffer bb = ByteBuffer.allocate(2);
	bb.order(ByteOrder.LITTLE_ENDIAN);
	bb.putShort((short) y);
	return new String(bb.array());
	
}


public static String createBinary(Facet f) {
	ByteBuffer bb = ByteBuffer.allocate(50);
	bb.order(ByteOrder.LITTLE_ENDIAN);
	bb.putFloat(f.getNormal().getX()).putFloat(f.getNormal().getY()).putFloat(f.getNormal().getZ());
	bb.putFloat(getVectors(f).get(0).getX()).putFloat(getVectors(f).get(0).getY()).putFloat(getVectors(f).get(0).getZ());
	bb.putFloat(getVectors(f).get(1).getX()).putFloat(getVectors(f).get(1).getY()).putFloat(getVectors(f).get(1).getZ());
	bb.putFloat(getVectors(f).get(2).getX()).putFloat(getVectors(f).get(2).getY()).putFloat(getVectors(f).get(2).getZ());
	bb.putShort((short) 1);
	
	return new String(bb.array());

}
 
}
