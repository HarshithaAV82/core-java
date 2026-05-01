package com.xworkz.smart.impl;

import com.xworkz.smart.inner.ReportGenerator;

public class ReportGeneratorImpl implements ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Report generated successfully");
    }

    @Override
    public void exportReport() {
        System.out.println("Report exported to file");
    }

    @Override
    public void printReport() {
        System.out.println("report sent to printer");
    }
}
