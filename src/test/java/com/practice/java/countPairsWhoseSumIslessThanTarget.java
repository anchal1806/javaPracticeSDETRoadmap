package com.practice.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countPairsWhoseSumIslessThanTarget {
    public static void main(String args[]){
        List<Integer> val = new ArrayList<>();
       // nums.addAll(Arrays.asList(-1,1,2,3,1));
       // int target =2;
        val.addAll(Arrays.asList(-6,2,5,-2,-7,-1,3));
        int target = -2;


        int ans  = countPairs(val,target);
        System.out.println("Hey worked on List and answer is "+ans);
    }
         public static int countPairs(List<Integer> nums, int target) {
            int ans = 0;
            for(int i=0; i < nums.size(); i++){
                for(int j=i+1; j < nums.size(); j++){
                    if(nums.get(i)+nums.get(j)<target){
                        ans++;
                    }
                }
            }
            return ans;
    }
}
