package com.xworkz.smart.runner;

import com.xworkz.smart.impl.ExamServiceImpl;
import com.xworkz.smart.inner.ExamService;

public class Main7 {

    public static void main(String[] args) {

        ExamService examService = new ExamServiceImpl();
        examService.startExam();
        examService.submitExam();
        examService.calculateResult();

        System.out.println(ExamService.DURATION);
        System.out.println(ExamService.SUBJECT);
    }
}
