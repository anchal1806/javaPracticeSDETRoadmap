package com.practice.java;

import java.util.HashMap;
import java.util.Map;

public class isAnangramUsingHashMap {
    public static void main(String[] args) {
        String str = "listen";
        String str2 ="silent";
       System.out.println(" "+anagram(str, str2));

    }
    public static boolean anagram(String str, String str2){
        HashMap<Character, Integer> hm = new HashMap<>();
        if(str.length() != str2.length())
        {
            System.out.println("Strings are not anagram");
            return false;
        }
        else {
            for (int i = 0; i < str.length(); i++) {
                if (!hm.containsKey(str.charAt(i))) {
                    hm.put(str.charAt(i), 1);
                } else {
                    hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
                }
            }
            for(int i =0; i<str2.length();i++){
                if(!hm.containsKey(str2.charAt(i))){
                    return false;
                }
                else{
                    hm.put(str2.charAt(i),hm.get(str2.charAt(i))-1);
                }
            }
            for(Map.Entry<Character,Integer> entry : hm.entrySet()){
                if(entry.getValue()>0)
                    return false;
                else
                    return true;
            }

            }
            return true;
            }

        }




