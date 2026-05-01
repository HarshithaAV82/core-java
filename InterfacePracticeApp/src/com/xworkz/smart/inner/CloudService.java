package com.xworkz.smart.inner;

public interface CloudService {

    String PROVIDER = "CloudStorage";
    int STORAGE_LIMIT = 1024;

    void uploadFile();
    void downloadFile();
    void deleteFile();
}
