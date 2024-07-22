package com.practice.java;

import java.util.Arrays;

public class longestCommonPrefixSecondWay {
    public static void main(String args[]) {
        String arr[] = {"armstrong", "armor", "armex","archer"};
        System.out.println("Hey common Prefix   " + commonPrefix(arr));
    }

    private static String commonPrefix(String []arr) {
        if (arr.length == 1)
            return arr[0];
         Arrays.sort(arr);
      /*   for(int j: arr){

         }*/
         String result = arr[0];

         for(int i =1; i<arr.length;i++){
             for(int j =0; j<result.length()-1;j++){
                 System.out.println("its j"+j);
                 if(arr[0].charAt(j) != arr[i].charAt(j)){
                     result = result.substring(0,j);
                     System.out.println(result);
                 }
             }
             }
        return result;

    }

}

