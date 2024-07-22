package com.practice.java;

public class ifNumPresentInTheArray {
    public static void main(String[] args) {
        int arr[] = {9,1,2,4,64,23,0,6,5};
        int num =9;
        int index =0;
        int flag =0;
        for(int  i=0; i<arr.length;i++){
            if(arr[i]==num){
               index =i;
               flag=1;
               break;
            }
        }
        if(flag==1){
            System.out.println("num is found  at    "+index);
        }
        else
            System.out.println("num is not present in the array");
    }
}
