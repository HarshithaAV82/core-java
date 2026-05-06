package com.xworkz.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

    public static void main(String[] args) throws Exception {

        Student student = new Student(101, "Harshitha");

        FileOutputStream fileOutputStream = new FileOutputStream("student.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(student);
        objectOutputStream.close();

        System.out.println("object serializable");

    }
}
