package com.practice.java;

import java.util.HashMap;
import java.util.Map;

public class sortHashMapUsingTreeSet {

    public static void main(String args[]) {
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("anchal", 10);
        hm1.put("soni",20);
        hm1.put("an",30);
        hm1.put("abc",40);
        HashMap<String, Integer> hm2 = new HashMap<>();
        hm2.put("rosh", 50);
        hm2.put("si",60);
        hm2.put("ant",70);
        hm2.put("apt",80);
       HashMap<Integer, HashMap<String, Integer>>  hm = new HashMap<>();
        hm.put(1, hm1);
        hm.put(12, hm2);

        for(Map.Entry<Integer, HashMap<String, Integer>>entry: hm.entrySet()){
           System.out.println("****"+ entry.getKey() +"****"+entry.getValue());
            HashMap<String, Integer> hm3 = entry.getValue();
            System.out.println("hm3    "+hm3.get("soni"));

       }

    }
}
