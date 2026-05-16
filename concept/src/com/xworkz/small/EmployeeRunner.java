package com.xworkz.small;

import com.xworkz.small.Developer;
import com.xworkz.small.Manager;
import com.xworkz.small.Tester;

public class EmployeeRunner {

    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.login();
        developer.work();
        developer.debug();

        System.out.println("-------------");

        Tester tester = new Tester();

        tester.login();
        tester.work();
        tester.reportBug();

        System.out.println("-------------");

        Manager manager = new Manager();

        manager.login();
        manager.work();
        manager.meeting();
    }
}