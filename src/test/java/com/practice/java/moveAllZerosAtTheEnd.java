package com.practice.java;

public class moveAllZerosAtTheEnd {
    public static void main(String[] args) {
        int arr[] ={1,0,9,8,5,0,3,2,0,0,3};
        int count =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]!=0){
                count++;
                arr[count]  = arr[i];
            }
        }
        for(int i =count+1; i<arr.length; i++){
            arr[i] =0;
        }
        for(int i =0; i< arr.length; i++){
            System.out.println("Array"+arr[i]);
        }
    }
}
