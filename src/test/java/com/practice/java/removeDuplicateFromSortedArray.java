package com.practice.java;

public class removeDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[] ={1,1,1,2,2,3,3,4,4,4};
        int count =0;
        int i = 0, j=1;
       while(i<arr.length && j<arr.length){
           if(arr[i]!=arr[j]){
               count++;
               arr[count]=arr[j];
               i=j;
               j=i+1;
           }
           i++;
           j++;
       }
       System.out.println("counts value is "+count);
       for(int k =0; k<=count; k++){
           System.out.println(arr[k]);
       }
    }
}
