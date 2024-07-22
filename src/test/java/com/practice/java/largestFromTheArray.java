package com.practice.java;

public class largestFromTheArray {
    public static void main(String[] args) {
        int arr[] = {10,2,3,5,9,19,18,7,6};
       System.out.println(""+ findLargestInArray(arr));
    }
    private static int findLargestInArray(int arr[]){
        int max = Integer.MIN_VALUE;
        int i =0;
        while(i<arr.length){
            max= Math.max(max, arr[i]);
            i++;
        }
        System.out.println("max value is "+max);
        return max;
    }
}
