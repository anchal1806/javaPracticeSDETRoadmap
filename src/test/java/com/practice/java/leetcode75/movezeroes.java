package com.practice.java.leetcode75;

public class movezeroes {
    public static void main(String[] args) {
int arr[]= {1,2,0,5,0,9};
       // {0,0,0,9,10};
        letsMoveZero(arr);
    }
    public static int[] letsMoveZero(int arr[]){
    int k =0;
    for(int i =0; i<arr.length;i++){
        if(arr[i]!=0){
            arr[k]= arr[i];
            k++;
        }
    }
    for(int i =k; i< arr.length; i++){
        arr[i] = 0;
    }
    for(int i =0; i< arr.length; i++)
    System.out.print( "  "+arr[i]);
    return arr;
     }
}

/*283. Move Zeroes
Solved
Easy
Topics
Companies
Hint
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1


Follow up: Could you minimize the total number of operations done?*/
