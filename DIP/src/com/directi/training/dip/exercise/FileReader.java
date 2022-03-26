package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader implements IReader{
	private String fileName;

    public FileReader(String fileName)
    {
        this.fileName = fileName;
    }
    
	public String read() throws IOException{
		BufferedReader reader = new BufferedReader(
                new java.io.FileReader(fileName));
		String aLine;
		String text="";
		while ((aLine = reader.readLine()) != null) {
			text+=aLine+="\n";
		}
		if (reader != null) {
            reader.close();
        }
		return text;
	}
}
