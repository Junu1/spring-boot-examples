package com.junu.example.qualifierexample;

import org.springframework.stereotype.Component;

@Component("student")
public class Student implements Person {
    @Override
    public void printName() {
        System.out.println("Student Name:");

    }

    @Override
    public void personPrf() {
        System.out.println("Student profile:");

    }
}
