package com.practice.java;
import static java.lang.System.*;

public class longestCommonPrefix {
    public static void main(String args[]) {
        String arr[] = {"armstrong", "armor", "archer"};
        System.out.println("Hey common Prefix   " + commonPrefix(arr));
    }

    private static String commonPrefix(String arr[]) {
        String result = arr[0];
        if (arr.length == 1)
            return arr[0];
        for (int i = 1; i < arr.length; i++) {
            while(arr[i].indexOf(result)!=0){
                result = result.substring(0,result.length()-1);
            }
            if(result.isEmpty())
                return "";
        }
        return result;
    }
}
