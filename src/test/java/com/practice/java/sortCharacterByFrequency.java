package com.practice.java;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class sortCharacterByFrequency {
    public static void main(String[] args) {
        String str ="tree";
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i =0; i<str.length(); i++){
            if(!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),1);
            }
            else{
                hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
            }

        }
    }
}
