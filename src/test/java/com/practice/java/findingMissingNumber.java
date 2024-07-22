package com.practice.java;

public class findingMissingNumber {
    public static void main(String[] args) {
        int arr[] ={1,2,3,5,6};
        int n =6;
        int arrNum=0;
        int sum = n*(n+1)/2;
        for(int i =0; i<arr.length;i++){
           arrNum+=arr[i];
        }
        System.out.println("missing number is "+(sum-arrNum));
    }
}
