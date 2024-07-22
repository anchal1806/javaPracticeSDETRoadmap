package com.practice.java;

public class kedaneAlgoFindMaxSumInGivenArray {
    public static void main(String[] args) {
        int arr[] ={4,-1,2,1};
        int currentSum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            currentSum +=arr[i];
            if(currentSum <0){
                currentSum=0;
            }
            if(currentSum>0){
            maxSum= Math.max(currentSum, maxSum);
        }
        }
        System.out.print("Max sum is "+maxSum);
    }
}
