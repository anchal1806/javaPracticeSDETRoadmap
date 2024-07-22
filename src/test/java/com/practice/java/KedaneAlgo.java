package com.practice.java;

public class KedaneAlgo {
    public static void main(String[] args) {
        int [] arr = {4,3,5,0,-7,2};
        int current_sum =0;
        int result = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            current_sum+=arr[i];
            if(current_sum > result){
                result = current_sum;
            }
            if(current_sum<0){
                current_sum =0;
            }
        }
        System.out.println(result);


    }
}
