package com.xworkz.interview;

public class Login {

    String email;
    String password;

    Login(String email, String password){
        this.email = email;
        this.password = password;
    }

    void loginCheck(){

        if(email.equals("admin@gmail.com")
                && password.equals("1234")){

            System.out.println("Login Successful");
        }
        else{
            System.out.println("Invalid Login");
        }
    }
}