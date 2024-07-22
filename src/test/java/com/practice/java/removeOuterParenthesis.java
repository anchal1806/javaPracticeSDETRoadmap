package com.practice.java;

import java.util.Stack;

public class removeOuterParenthesis {
    public static void main(String[] args) {
        String  str = "({({})[()()]})";
        remove(str);
    }
    private static String remove(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

        }
        return str;
    }
}
