package com.junu.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class Starter implements CommandLineRunner {
    @Autowired
    @Qualifier("addition")
    Calculation addition;

    @Autowired
    @Qualifier("subtraction")
    Calculation subtraction;

    @Override
    public void run(String... args) throws Exception {
        addition.add();
        subtraction.subtract();

    }
}
