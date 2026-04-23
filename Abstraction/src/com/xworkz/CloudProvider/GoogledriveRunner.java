package com.xworkz.CloudProvider;

public class GoogledriveRunner{

    public static void main(String[] args){

        CloudProvider provider = new Googledrive();

        provider.uploadFile();
        provider.authenticate();
        provider.establishConnection();
    }
}