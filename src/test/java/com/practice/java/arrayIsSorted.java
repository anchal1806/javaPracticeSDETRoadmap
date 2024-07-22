package com.practice.java;

public class arrayIsSorted {
    public static void main(String[] args) {
        int arr[] ={8,9,11,12,10,13};
        int flag =0;
      /*  for(int i =0; i< arr.length; i++){
            for(int j =i;j<arr.length; j++){
                if(arr[i]>arr[j]){
                    flag =1;
                    break;
                }

            }
        }*/
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                flag =1;
                break;
            }
        }
        if(flag!=0){
            System.out.println("array is not sorted");
        }
        else
            System.out.println("array is sorted");
    }

}
