package com.xworkz.StudentManagement;

public class Student {

    private String name;
    private  int age;
    private  double marks;

    Student(String name, int age, double marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }
    public String calculateGrade(){
        if(marks >=90) return "A+";
        else if (marks >= 75) return "A";
        else if(marks >=60) return "B";
        else if(marks >=50) return "C";
        else return "Fail";
    }

    public void display(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Marks:" + marks);
        System.out.println("Grade:" + calculateGrade());

    }
}
