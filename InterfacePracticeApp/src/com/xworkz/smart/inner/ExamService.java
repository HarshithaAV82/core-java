package com.xworkz.smart.inner;

public interface ExamService {

    String SUBJECT = "Java";
    int DURATION = 120;

    void startExam();
    void submitExam();
    void calculateResult();
}
