package com.practice.java;

import java.util.HashSet;
import java.util.Set;

public class removeduplicate {
    public static void main(String[] args) {
        String str="apple";
        Set<Character> set = new HashSet<>();
        for(int i=0; i< str.length();i++){
            set.add(str.charAt(i));
        }
        System.out.println("Duplicate "+set.toString());
    }

}
