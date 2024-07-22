package com.practice.java;

public class Second extends First {

    Second(int j) {
        super(j);
        System.out.println("hey I am of second "+i);
        this.i = j * 10;
    }
}
