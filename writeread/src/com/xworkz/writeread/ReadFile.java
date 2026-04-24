package com.xworkz.writeread;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {


    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String line;

        while ((line = reader.readLine())!= null){
            System.out.println(line);

        }
        reader.close();
    }
}
