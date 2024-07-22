package com.practice.java;

public class reverseEachWordsInSentence {
    public static void main(String[] args) {
        String word = "Hey there come here";
        String arr[] = word.split(" ");
        StringBuilder sb = new StringBuilder();
        /*logic to reverse each word att the same place*/
        for(int i =0; i< arr.length; i++){
            StringBuilder sb2 = new StringBuilder();
            for(int j=arr[i].length()-1; j>=0; j--){
               sb2.append(arr[i].charAt(j));
            }
            sb.append(sb2+" ");
            //sb.append(" ");
        }
        System.out.println(sb.toString());

        /*logic to reverse the word*/
        StringBuilder sbrev = new StringBuilder();
        /*logic to reverse each word att the same place*/
        for(int i =arr.length-1; i>=0; i--){
            sbrev.append(arr[i]+" ");
        }
            //sb.append(" ");

        System.out.println(sbrev.toString());

    }

}
