package com.practice.java;

import java.util.Arrays;

public class findMaxOfArray {
    public static void main(String[] args) {
        int arr[] ={1001,11,23,45,54,89,90, 9000};
        int max =arr[0];
        for(int i=1; i<=arr.length-1; i++){
            if(max<arr[i]){
                max= arr[i];
            }
        }
        System.out.println("max"+max);
        Arrays.sort(arr);
        System.out.println("array  "+arr[arr.length-1]);
    }
}
