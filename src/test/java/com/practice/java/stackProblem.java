package com.practice.java;

import java.util.Stack;

public class stackProblem {
    public static void main(String args[]){
        //removeDuplicates("abbaca");
        removeDuplicates("azxxzy");

    }

        public static String  removeDuplicates(String s) {
            Stack<Character> stack = new Stack<>();
            char c;
            for(int i =0; i<s.length();i++) {
                if (!stack.empty()) {
                    if (stack.peek() == s.charAt(i)) {
                        stack.pop();
                    } else{
                        stack.push(s.charAt(i));
                    }
                }
                else
                    stack.push(s.charAt(i));
            }
            int len = stack.size();
            int i =0;
            char[] c1 = new char[len];
            while(!stack.empty() && i<len){
                c1[i]= stack.pop();
                System.out.println(c1[i]);
                i++;
            }
            System.out.println(c1.toString());
            return c1.toString();
        }

}
