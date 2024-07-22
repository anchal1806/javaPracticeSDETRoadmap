package com.practice.java;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr ={1,4,3,5,7};
        int i=0;
        int j = arr.length-1;
        int temp;
       while(i<j){
           temp = arr[j];
           arr[j] = arr[i];
           arr[i] =temp;
           i++;
           j--;
       }
       System.out.print("Hey"+Arrays.toString(arr));
       for(int k =0; k< arr.length; k++)
       System.out.print("  "+arr[k]);
    }
}
