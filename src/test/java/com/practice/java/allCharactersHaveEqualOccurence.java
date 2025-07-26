package com.practice.java;

import java.util.HashMap;
import java.util.Map;

public class allCharactersHaveEqualOccurence {

    public static void main(String[] args) {

            System.out.println(" Return of  :"+checkOccurence("abacbfc"));
    }
    private static Boolean checkOccurence(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }
            else{
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }
        }
        int value = hm.get(s.charAt(0));
        for (Map.Entry<Character,Integer> entry : hm.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

            if(entry.getValue()!=value){
                return false;
            }
        }
        return true;

    }

}






/*Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).



Example 1:

Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
Example 2:

Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.


Constraints:

1 <= s.length <= 1000
s consists of lowercase English letters.*/
