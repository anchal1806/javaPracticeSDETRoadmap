package com.practice.java;

import org.omg.Messaging.SyncScopeHelper;

public class leftRotateArrayBYOne {
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5,6,7};
        int temp = arr[0];
        int i =0;
        for(i = 1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

   i=0;
   while(i< arr.length){
       System.out.println(arr[i]);
       i++;
   }
    }


}
