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
		
	//	 MetamodellFactory f = new MetamodellFactoryImpl();
	//	 Color c = f.createColor();
	//	 c.setR(30);
	//	 c.setG(20);
	//	 c.setB(20);
	//	 FacetImpl fac = (FacetImpl) f.createFacet();
	//	 fac.setColor(c);
	//	 createColorBits(c);
		 
		floatToByte(0f, 1f, -1f);
	 }
	 
	 
	public static byte[] setBytes(int a, int b, int c, int d) {
		ByteBuffer bb = ByteBuffer.allocate(4);
		bb.order(ByteOrder.LITTLE_ENDIAN);
		bb.put((byte) a);
		bb.put((byte) b);
		bb.put((byte) c);
		bb.put((byte) d);
	//	return new String(bb.array());
		return bb.array();
	}
	 
	public static byte[] intToByte(int n) {
			ByteBuffer bb = ByteBuffer.allocate(4);
			bb.order(ByteOrder.LITTLE_ENDIAN);
			bb.putInt(n);
	//		return new String(bb.array());
			return bb.array();
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
		//bb.order(ByteOrder.LITTLE_ENDIAN);
		bb.putFloat(n);
		bb.order(ByteOrder.LITTLE_ENDIAN);
		System.out.println(Arrays.toString(bb.array()));
		return new String(bb.array());
	}
	
	public static String floatToByte(float x, float y, float z) {
		ByteBuffer bb = ByteBuffer.allocate(12);
		bb.order(ByteOrder.LITTLE_ENDIAN);
		bb.putFloat(z).putFloat(y).putFloat(x);
		return new String(bb.array());
	}
	
	public static ArrayList<Vector3f> getVectors(Facet f) {
		ArrayList<Vector3f> vec = new ArrayList<Vector3f>();
//		for(Edge e : f.getEdges()) {
//			if(!vec.contains(e.getP().get(0))) {
//				vec.add(e.getP().get(0));
//			}
//			if(!vec.contains(e.getP().get(1))) {
//				vec.add(e.getP().get(1));
//			}
//		}
		vec.add(f.getX());
		vec.add(f.getY());
		vec.add(f.getZ());
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
	
	
	public static byte[] createBinary(Facet f) {
			
		ArrayList<Vector3f> vecs = getVectors(f);
		System.out.println(vecs);
		ByteBuffer bb = ByteBuffer.allocate(50);
		bb.order(ByteOrder.LITTLE_ENDIAN);
		bb.putFloat(f.getNormal().getX()).putFloat(f.getNormal().getY()).putFloat(f.getNormal().getZ());
		bb.putFloat(vecs.get(0).getX()).putFloat(vecs.get(0).getY()).putFloat(vecs.get(0).getZ());
		bb.putFloat(vecs.get(1).getX()).putFloat(vecs.get(1).getY()).putFloat(vecs.get(1).getZ());
		bb.putFloat(vecs.get(2).getX()).putFloat(vecs.get(2).getY()).putFloat(vecs.get(2).getZ());	
		if(f.getColor() != null) {
			System.out.println(Integer.toBinaryString(f.getColor().getG()));
			System.out.println(Integer.toBinaryString(f.getColor().getR()));
			System.out.println(Integer.toBinaryString(f.getColor().getB()));
			int x = (f.getColor().getG() << 5) | f.getColor().getR();
			int y = ((f.getColor().getB() << 10) | x) ;
			int z = y | (0 << 16);
			System.out.println(Integer.toBinaryString(z));
			bb.putShort((short) z);
			
		}			
		else {
		bb.putShort((short) 65535);
		}
		
			
		
	//	return new String(bb.array());
		return bb.array();
	}
	 
	}
