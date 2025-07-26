package com.practice.java.leetcode75;

public class moveAllOnesInLeft {
    public static void main(String[] args) {
     int nums[] = {4,1,1,2,0,10,1};
     letsMoveOnes(nums);
    }
    public static int[] letsMoveOnes(int nums[]){
        int k =nums.length-1;
        for(int i =nums.length-1; i>=0; i--){
            if(nums[i]!=1){
                nums[k] = nums[i];
                k--;
            }
        }
        for(int i=0; i<=k; i++){
            nums[i]=1;
        }
for(int i=0; i<nums.length; i++){
    System.out.println(nums[i]);
}
return nums;
    }
}
