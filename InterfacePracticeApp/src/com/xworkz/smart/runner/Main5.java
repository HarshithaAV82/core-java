package com.xworkz.smart.runner;

import com.xworkz.smart.impl.CloudServiceImpl;
import com.xworkz.smart.inner.CloudService;

public class Main5 {

    public static void main(String[] args) {

        CloudService cloudService = new CloudServiceImpl();
        cloudService.uploadFile();
        cloudService.downloadFile();
        cloudService.deleteFile();

        System.out.println(CloudService.PROVIDER);
        System.out.println(CloudService.STORAGE_LIMIT);
    }
}
