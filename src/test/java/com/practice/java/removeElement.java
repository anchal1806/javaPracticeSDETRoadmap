package com.practice.java;

public class removeElement {
    public static void main(String args[]){
        int arr[] ={0,1,2,2,3,0,4,2};
        int arr1[] = {3,2,2,3};
        System.out.println(" element count after removing given value " + removeKElement(arr,1));
        System.out.println(" element count after removing given value " + removeKElement(arr1,3));

    }
    private static int removeKElement(int arr[],int value){
        int count = 0;
       for(int i=0; i< arr.length;i++) {
           if (arr[i] != value) {
               arr[count] = arr[i];
               count++;
           }
       }
           for(int j =0; j<count; j++) {
               System.out.print( "  "+ arr[j]);
           }

        return count;
    }

}
