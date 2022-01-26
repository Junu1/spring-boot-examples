package com.junu.example;

import com.junu.example.qualifierexample.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Start implements CommandLineRunner {

    @Autowired
    @Qualifier("student")
    private Person student;

    @Autowired
    @Qualifier("employee")
    private Person employee;

    @Override
    public void run(String... args) throws Exception {
        student.printName();
        student.personPrf();

        employee.personPrf();
        employee.printName();
    }
}


