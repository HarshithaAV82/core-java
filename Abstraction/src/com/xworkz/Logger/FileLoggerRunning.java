package com.xworkz.Logger;

public class FileLoggerRunning {

    public static void main(String[] args) {

        FileLogger fileLogger = new FileLogger();

        fileLogger.logWarning();
        fileLogger.logError();

        System.out.println("Timestamp: " + fileLogger.getTimestamp());
    }
}