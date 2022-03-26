package com.directi.training.dip.exercise;


import java.io.IOException;
import java.util.Base64;

public class EncodingModule
{  
    public void encode(IReader reader,IWriter writer) {
    	String inputString = "abc";
		try {
			inputString = reader.read();
		} catch (IOException e) {
		}
    	String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
    	System.out.println(encodedString);
    	try {
			writer.write(encodedString);
		} catch (IOException e) {
		}
    	
    }
}

