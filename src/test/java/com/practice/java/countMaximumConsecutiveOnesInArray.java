package com.practice.java;

public class countMaximumConsecutiveOnesInArray {
    public static void main(String[] args) {
        int arr[] ={1,1,0,1,1,1,0,1,1,1,1,0};
        int max =0;
        int count =0;
        for(int i =0; i<arr.length; i++){
            max= Math.max(max, count);
            if(arr[i]==0){
                count =0;
            }
            else
                count++;
        }
       // max= Math.max(max,count);
        System.out.println("Max occurence of 1s is "+max);
    }
}
