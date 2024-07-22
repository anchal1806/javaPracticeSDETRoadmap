package com.practice.java;

public class recursion {
    public static void main(String args[]){
        func(5);
    }
   static void func(int n){
        if(n==1){
            return;
        }
        func(n-1);
        System.out.println(n);
    }
}
