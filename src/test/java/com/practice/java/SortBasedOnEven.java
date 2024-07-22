package com.practice.java;

public class SortBasedOnEven {
    public static void main(String args[]){
        int arr[] ={1,3,4,5,2,7};
        int count =0;
        int temp =0;
        int value =0;
        for(int j=0; j< arr.length; j++){
            value = arr[j];
            if(value %2 ==0){
               /* temp = arr[j];
                arr[j] = arr[count];
                arr[count] = temp;
                count++;

                */
                arr[count] = arr[j]+arr[count];
                arr[j] = Math.abs(arr[count]-arr[j]);
                arr[count] = Math.abs(arr[count]-arr[j]);
                count++;
              //  System.out.print(" " +arr[count]);
               // System.out.print("  "+arr[j]);

            }
        }

        for(int k =0; k< arr.length; k++)
        System.out.print(" "+arr[k]);
    }
}
