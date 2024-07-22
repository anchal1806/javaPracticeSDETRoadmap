package com.practice.java;

public class reverseString {
    public static void main(String args[]){
        String s = "anchal";
       System.out.println("Reveresed "+ reversed(s));
    }
    private static String reversed(String s){
        StringBuffer sb = new StringBuffer();
        for(int i =s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
