package com.xworkz.smart.impl;

import com.xworkz.smart.inner.ExamService;

public class ExamServiceImpl implements ExamService {


    @Override
    public void startExam() {
        System.out.println("Exam started");
    }

    @Override
    public void submitExam() {
        System.out.println("Exam submitted");
    }

    @Override
    public void calculateResult() {
        System.out.println("Result calculated");
    }
}
