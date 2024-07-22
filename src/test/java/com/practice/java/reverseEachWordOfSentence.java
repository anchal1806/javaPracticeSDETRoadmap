package com.practice.java;

public class reverseEachWordOfSentence {

    public static void main(String args[]){
        String word = "Hey Let's learn new things";
        String arr[] = word.split(" ");
        StringBuffer sb = new StringBuffer();

        for(int i=arr.length-1; i>=0; i--){
            StringBuffer sb1 = new StringBuffer();
            for(int j= arr[i].length()-1; j>=0; j--){
                sb1.append(arr[i].charAt(j));
            }
            sb.append(sb1+" ");
        }
        System.out.println(sb.toString());
    }
}
