package org.xtext.example.mydsl.api;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.xtext.example.mydsl.serialiser.Serialiser;

import Metamodell.Solid;

public class RunSerialiser {
	public void unparse(String filePath, Solid board) {
		try {
			File file = new File(filePath);
			FileWriter fileWriter;
			fileWriter = new FileWriter(file);
			fileWriter.write(Serialiser.serialise(board));
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
