package com.practice.java;

import java.util.HashMap;

public class NestedHashmap
{
    public static void main(String args[]){
        HashMap<Character, Object> hm = new HashMap<>();
        hm.put('A',10);
        HashMap<Character, Integer> hm1 = new HashMap<>();
        hm1.put('c',12);
        hm1.put('d',22);
        hm.put('B',hm1);
        hm.put('E',13);
        System.out.println(hm);
    }
}
