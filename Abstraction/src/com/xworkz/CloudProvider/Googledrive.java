package com.xworkz.CloudProvider;

public class Googledrive implements CloudProvider{

    @Override
    public void uploadFile(){
        System.out.println("UploadFile is running in cloudprovider...");
    }

    @Override
    public void authenticate(){
        System.out.println("authenticate is running in cloudprovider...");
    }
}