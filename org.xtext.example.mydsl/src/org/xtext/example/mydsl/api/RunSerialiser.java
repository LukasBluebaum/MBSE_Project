package org.xtext.example.mydsl.api;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

import org.xtext.example.mydsl.serialiser.ByteConverter;
import org.xtext.example.mydsl.serialiser.Serialiser;

import Metamodell.Facet;
import Metamodell.Solid;

public class RunSerialiser {
	public void unparse(String filePath, Solid s) {
//		try {
//			File file = new File(filePath);
//			FileWriter fileWriter;
//			fileWriter = new FileWriter(file);
//			fileWriter.write(Serialiser.serialise2(s));
//			fileWriter.flush();
//			fileWriter.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		File file = new File(filePath);
		 try (OutputStream out = new FileOutputStream(file)) {
			 out.write("COLOR=".getBytes());
			 out.write(ByteConverter.setBytes(127,127,127,32));
			 out.write("MATERIAL=".getBytes());
			 out.write(ByteConverter.setBytes(127,127,127,32));
			 out.write(ByteConverter.setBytes(127,127,127,32));
			 out.write(ByteConverter.setBytes(127,127,127,32));
			 out.write("                                                 ".getBytes());
			 out.write(ByteConverter.intToByte(s.getFacets().size()));
			 for(Facet f: s.getFacets()) {
				 out.write(ByteConverter.createBinary(f));
			 }
		 } catch(IOException e) {
			 e.printStackTrace();
		 }

	}
}
