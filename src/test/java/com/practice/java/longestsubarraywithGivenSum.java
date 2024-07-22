package com.practice.java;

public class longestsubarraywithGivenSum {
    public static void main(String[] args) {
       int len = 5, sum = 10, arr[] = {2,3,4,1,9,5};
       int left=0,right=0;
       int target =sum;
       int count =0;
    //   int resultLeft =0, resultright =0;
       int max = Integer.MIN_VALUE;
       while(left<arr.length && right<arr.length)
       {
           if(target>0){
           target = target -arr[right];
           count++;
           right++;
        //   System.out.println("hey"+target);
       }
           if(target ==0){
               max= Math.max(max, count);
               count =0;
               left++;
               right =left;
               target =sum;
            //   System.out.println("hello"+count);
           }
           if(target < 0){
               count =0;
               left++;
               right =left;
               target = sum;
              // System.out.println("heyMan"+target );
           }
       }
       System.out.println("max is"+max);

    }
}
