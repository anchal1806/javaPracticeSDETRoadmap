package com.practice.java;

public class checkIfTwoArraysAreEqual {
    public static void main(String args[]){
        String arr1[] ={"ab","c"};
        String arr2[] ={"a","bc"};
        System.out.println("After Checking both arrays result is :"+check(arr1,arr2));

    }
    private static boolean check(String arr1[], String arr2[]){
      //  boolean flag = false;
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for(int i =0; i< arr1.length;i++){
            sb1.append(arr1[i]);
        }
        System.out.println("sb1  "+sb1);
        for(int i =0; i< arr2.length;i++){
            sb2.append(arr2[i]);
        }
        System.out.println("sb2  "+sb2);

       if(sb1.toString().equals(sb2.toString())){
           return true;
       }
      else {
           return false;
       }
    }
}

/*Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.



Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true


Constraints:

1 <= word1.length, word2.length <= 103
1 <= word1[i].length, word2[i].length <= 103
1 <= sum(word1[i].length), sum(word2[i].length) <= 103
word1[i] and word2[i] consist of lowercase letters.
*/
