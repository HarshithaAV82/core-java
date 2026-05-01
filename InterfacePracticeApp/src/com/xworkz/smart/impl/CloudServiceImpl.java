package com.xworkz.smart.impl;

import com.xworkz.smart.inner.CloudService;

public class CloudServiceImpl implements CloudService {


    @Override
    public void uploadFile() {
        System.out.println("File iploaded to cloud");
    }

    @Override
    public void downloadFile() {
        System.out.println("File downloaded from cloud");
    }

    @Override
    public void deleteFile() {
        System.out.println("File deleted from cloud");
    }
}
