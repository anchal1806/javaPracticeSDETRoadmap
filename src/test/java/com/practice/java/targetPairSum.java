package com.practice.java;

import java.util.HashMap;

public class targetPairSum {
    public static void main(String[] args){
        int arr1[]= {2,6,5,8,11};
        int target = 14;
      int arr2[] =indexOfArray(14,arr1);
      for(int i =0; i<arr2.length;i++){
          System.out.println("Mummy is the best"+arr2[i]);
      }
    }

private static int[] indexOfArray(int target,int arr[]){
  //   target = 14;
    //int arr2[]= {2,6,5,8,11};
    //int flag =0;
    HashMap<Integer, Integer> hm = new HashMap<>();
    for(int i =0; i<arr.length; i++){
        if(hm.getOrDefault(target-arr[i],null)!=null) {
            System.out.println(new int[]{i,target-arr[i]});
            System.out.println(i+" "+(target-arr[i]));
            return new int[]{i,target-arr[i]};
        }
        else
            hm.put(target-arr[i],i);
    }
    return new int[2];
}
}
