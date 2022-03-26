package com.directi.training.dip.exercise;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter implements IWriter{
	private String fileName;

    public FileWriter(String fileName)
    {
        this.fileName = fileName;
    }
	public void write(String encodedLine) throws IOException{
		BufferedWriter writer = new BufferedWriter(
                new java.io.FileWriter(fileName));
		writer.write(encodedLine);
		if (writer != null) {
            writer.close();
        }
	}

}
