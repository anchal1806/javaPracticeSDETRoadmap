package com.practice.java;

public class IncrementOrderZeroOneTwo {
    public static void main(String[] args) {
        int arr[] ={2,0,2,1,1,0};
        int ones =0;
        int twos =0;
        int zeros =0;
        int j=0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==0){
                zeros++;
            }
            else if(arr[i]==1){
                ones++;
            }
            else if(arr[i]==2){
                twos++;
            }
        }
        for(j =0; j<zeros; j++){
            arr[j] =0;
        }
        for(j=zeros; j<ones+zeros; j++ ){
            arr[j] =1;
        }
        for(j=ones+zeros; j<arr.length; j++){
            arr[j]=2;
        }
        for(int i =0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
