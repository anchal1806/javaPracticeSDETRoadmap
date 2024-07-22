package com.practice.java;

public class reverseAWord {
    public static void main(String args[]){
        String word ="I am singer of the house";
       System.out.println("PRINT "+rev(word));
    }
    static String rev(String s){
        StringBuffer sb = new StringBuffer();
        String arr[] = s.split(" ");
        for(int i= arr.length-1; i>=0; i--){
            sb.append(arr[i]+" ");
        }

        return sb.toString();
    }
}
