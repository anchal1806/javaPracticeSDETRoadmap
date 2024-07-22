package com.practice.java;

public class staticExecutionOrder {


        public static void main(String args[]){
            System.out.println("Hello main");

    }
    static{System.out.println("static block is invoked");}
}
