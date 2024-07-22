package com.practice.java;

public class appearanceOfNumberOnce {
    public static void main(String[] args) {
        int arr[] ={1,2,3,3,4,1,2};
        int i=0, j =1;
        int count =0;
        int index=-1;
        for(i=0; i<arr.length; i++){
            count =0;
            for(j=0; j<arr.length; j++){
               if(arr[i] ==arr[j]){
                   count++;
               }
            }
            if(count ==1){
                System.out.println(arr[i] +"is unique");
            }
        }

    }
}
