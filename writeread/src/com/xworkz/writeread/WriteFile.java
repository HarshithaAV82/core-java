package com.xworkz.writeread;

import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) throws Exception{
        FileWriter fileWriter = new FileWriter("output.txt");
        fileWriter.write("heyy hi i am Harshitha A V !");
        fileWriter.close();
        System.out.println("Data written successfully!....");
    }


}
