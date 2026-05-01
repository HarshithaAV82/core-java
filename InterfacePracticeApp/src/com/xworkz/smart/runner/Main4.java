package com.xworkz.smart.runner;

import com.xworkz.smart.impl.ReportGeneratorImpl;
import com.xworkz.smart.inner.ReportGenerator;

public class Main4 {

    public static void main(String[] args) {
        ReportGenerator reportGenerator = new ReportGeneratorImpl();
        reportGenerator.generateReport();
        reportGenerator.exportReport();
        reportGenerator.printReport();

        System.out.println(ReportGenerator.FORMAT);
        System.out.println(ReportGenerator.MAX_PAGES);
    }
}
