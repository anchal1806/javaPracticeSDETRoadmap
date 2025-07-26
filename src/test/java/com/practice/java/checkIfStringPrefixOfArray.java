package com.practice.java;

public class checkIfStringPrefixOfArray {

    public static void main(String[] args) {
        String  s = "iloveleetcode";
        String [] words = {"i","love","leetcode","apples"};

        System.out.println("is String s prefix of words array : "+prefix(s,words));
        System.out.println("is String s prefix of words array : "+prefix("iloveleetcode", new String[]{"apples", "i", "love", "leetcode"}));

    }

    private static Boolean prefix(String s, String[]words){
        String w ="";
         for(int i =0; i<words.length;i++){
              w= w+ words[i];
             if(w.equals(s)){
                 System.out.println(i);
                 return true;
             }

         }
         return false;

    }
}
/*Given a string s and an array of strings words, determine whether s is a prefix string of words.

A string s is a prefix string of words if s can be made by concatenating the first k strings in words for some positive k no larger than words.length.

Return true if s is a prefix string of words, or false otherwise.



Example 1:

Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
Output: true
Explanation:
s can be made by concatenating "i", "love", and "leetcode" together.
Example 2:

Input: s = "iloveleetcode", words = ["apples","i","love","leetcode"]
Output: false
Explanation:
It is impossible to make s using a prefix of arr.


Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 20
1 <= s.length <= 1000
words[i] and s consist of only lowercase English letters.*/
