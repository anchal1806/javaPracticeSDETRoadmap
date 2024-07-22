package com.practice.java;

import java.util.HashMap;
import java.util.Map;

public class isAnagramWord {
    //Anagram is listen silent
    //triangle integral
    //abc cba
    //abc ccb : is false
    public static void main(String[] args) {
        System.out.println("Strings are "+   checkAnagram("listen","silent")     +"       anagram");
        System.out.println("Strings are "+   checkAnagram("triangle","integral")     +"       anagram");
        System.out.println("Strings are "+   checkAnagram("abc","cba")     +"       anagram");
        System.out.println("Strings are "+   checkAnagram("abc","ccb")     +"       anagram");
    }
    static boolean checkAnagram(String str, String str1) {
        if (str.length() != str1.length()) {
            return false;
        } else {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                if (!map.containsKey(str.charAt(i))) {
                    map.put(str.charAt(i), 1);
                }
                else map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }

            for (int i = 0; i < str1.length(); i++) {
                if (!map.containsKey(str1.charAt(i))) {
                    return false;
                }
               else map.put(str1.charAt(i), map.get(str1.charAt(i)) - 1);
            }
             for(Map.Entry<Character, Integer> entry:map.entrySet()){
                 System.out.println("entry key "+entry.getKey()+"  "+entry.getValue());
                if(entry.getValue()>0){
                     return false;
                 }
             }
        }
        return true;
    }

}
