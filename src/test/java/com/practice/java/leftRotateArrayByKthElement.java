package com.practice.java;

import java.util.Arrays;

public class leftRotateArrayByKthElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int k =3;
        int temp[] = new int[k];
        for(int i =0; i<k; i++){
            temp[i] = arr[i];
        }
        int len = 0;
        for(int i =0; i<arr.length-k; i++){
            arr[i] = arr[k+i];
        }
        for(int i =arr.length-k; i<arr.length; i++ ){
            arr[i] =temp[len];
            len++;
        }
        for(int i =0; i<arr.length; i++){
            System.out.println("array"+arr[i]);
        }
    }
}
