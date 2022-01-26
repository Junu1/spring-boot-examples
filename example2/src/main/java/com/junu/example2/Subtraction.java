package com.junu.example2;

import org.springframework.stereotype.Component;

@Component("subtraction")

public class Subtraction implements Calculation {
    private int a = 6;
    private int b = 2;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void subtract() {
        System.out.println(this.a - this.b);

    }

    @Override
    public void add() {

    }
}
