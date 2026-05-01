package com.xworkz.smart.inner;

public interface ReportGenerator {

    String FORMAT = "PDF";
    int MAX_PAGES = 100;

    void generateReport();
    void exportReport();
    void printReport();

}
