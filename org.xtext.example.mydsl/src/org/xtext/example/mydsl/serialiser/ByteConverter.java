package org.xtext.example.mydsl.serialiser;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class ByteConverter {
 public static void main(String[] args) throws UnsupportedEncodingException 	{
	 String decodedData = new String(intToByte(32));
	 System.out.println(decodedData);
 }
 
 public static String intToByte(int val) throws UnsupportedEncodingException {
	 byte[] b = new byte[4];
	 	 for(byte i=0;i<4;i++)
	     b[i] = (byte)(val >> i*8);
		 String s = Base64.getEncoder().encodeToString(b);
		 return s;
 }
 
}
