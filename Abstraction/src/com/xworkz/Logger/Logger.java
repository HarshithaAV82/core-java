package com.xworkz.Logger;

import java.time.LocalDateTime;

public interface Logger {

    void logError();

    void logWarning();

    default LocalDateTime getTimestamp() {

        System.out.println("get time stamp is running ....");

        return LocalDateTime.now();
    }
}