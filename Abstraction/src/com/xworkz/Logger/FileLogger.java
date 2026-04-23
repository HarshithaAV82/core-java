package com.xworkz.Logger;

public class FileLogger implements  Logger{


    @Override
    public void logError() {
        System.out.println("running logError");
    }

    @Override
    public void logWarning() {
        System.out.println("running logwarning");
    }
}
