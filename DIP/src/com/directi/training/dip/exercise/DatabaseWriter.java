package com.directi.training.dip.exercise;

public class DatabaseWriter implements IWriter
{
    @Override
    public void write(String input)
    {
        MyDatabase database = new MyDatabase();
        database.write(input);
    }
}
