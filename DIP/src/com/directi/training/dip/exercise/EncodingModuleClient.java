package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule();
        IReader reader = new FileReader("C:\\Users\\Mallou\\Desktop\\Qualité\\TP\\SOLID-master\\DIP\\src\\com\\directi\\training\\dip\\exercise\\beforeEncryption.txt");
        IWriter writer = new FileWriter("C:\\Users\\Mallou\\Desktop\\Qualité\\TP\\SOLID-master\\DIP\\src\\com\\directi\\training\\dip\\exercise\\afterEncryption.txt");
        encodingModule.encode(reader,writer);   
        
        reader = new InternetReader("http", "myfirstappwith.appspot.com", "/index.html");
        writer = new DatabaseWriter();
        encodingModule.encode(reader, writer);
    }
}
