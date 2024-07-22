package com.practice.java;

import java.util.Arrays;

public class longestConsecutiveNumbers {
    public static void main(String[] args) {
        int arr[] ={100,101,102,103,104,200,1,2,3,4};
       // Arrays.sort(arr);
        int temp =0;
        int min =0;
        for(int i =0; i<arr.length; i++){
           for(int j=i+1; j<arr.length;j++){
             if(arr[i]>arr[j]){
                 temp = arr[i];
                 arr[i]=arr[j];
                 arr[j]= temp;
             }
           }

        }
        int count =0;
        for(int j =0; j<arr.length; j++){
            System.out.print(" "+arr[j]);
        }
       int k =0;
        int max =0;
        int j=0;
     while(k<arr.length-1){
         while(arr[k]+1==arr[k+1] && k<arr.length){
             count++;
             k++;
         }
         max =Math.max(max,count) ;
         count =0;
         k++;

     }

           System.out.println(" count "+(max+1));

        }

}
