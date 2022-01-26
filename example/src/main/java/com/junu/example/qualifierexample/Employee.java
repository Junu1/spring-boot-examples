package com.junu.example.qualifierexample;

import org.springframework.stereotype.Component;

@Component("employee")
public class Employee implements Person {

    @Override
    public void printName() {
        System.out.println("Employee Name:");

    }

    @Override
    public void personPrf() {
        System.out.println("Employee Profile:");

    }
}
