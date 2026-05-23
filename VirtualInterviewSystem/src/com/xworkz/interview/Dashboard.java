package com.xworkz.interview;

public class Dashboard {

    public static void main(String[] args) {

        Login l =
                new Login("admin@gmail.com","1234");

        l.loginCheck();

        Register r =
                new Register("Harshitha",
                        "harshi@gmail.com");

        r.showDetails();

        HRInterview hr =
                new HRInterview();

        hr.questions();

        Result res =
                new Result(8);

        res.display();
    }
}