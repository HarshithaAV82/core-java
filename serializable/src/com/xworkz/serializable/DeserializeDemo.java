package com.xworkz.serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeDemo {

    public static void main(String[] args) throws Exception {

        FileInputStream fileInputStream = new FileInputStream("student.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(student.id + " " + student.name);
    }
}