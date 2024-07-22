package com.practice.java;

public class countSubArraySumEqualsK {
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4};
        int k =6;
        int target =k;
        int count =0;
        int leftIndex =0, rightIndex=0;
        while(leftIndex<arr.length && rightIndex<arr.length){
            if(target == 0){
                count++;
                rightIndex = leftIndex;
                leftIndex++;
                target =k;
                System.out.println("count is"+count);
            }
            if(target>0){
                target = target-arr[rightIndex];
                rightIndex++;
            }
            if(target<0){
                target =k;
                rightIndex = leftIndex;
                leftIndex++;
            }
            System.out.println(" "+leftIndex +" "+rightIndex +" "+target);
        }
        System.out.println("Total subarrays are "+count);
    }
}
