package com.practice.java;

public class findTheLeader {
    public static void main(String[] args) {
        int arr[] ={10, 22, 12, 3, 0, 6,23};
        int j = 0;
        int i =0;
        for( i =0; i<arr.length; i++){
            for(j =i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    break;
                }
            }
            if(j ==arr.length){
                break;
            }
        }
        System.out.println("leader is"+i +" "+arr[i]);
    }
}
