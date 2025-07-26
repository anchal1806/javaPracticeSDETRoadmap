package com.practice.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class wordPattern1 {
    public static void main(String[] args) {
        String s = "baabc";
        String value = "dog car car dog dog";
        System.out.println("The word pattern is   :"+wordPatternFindings(s,value));

    }
   public static Boolean wordPatternFindings(String s, String pattern){
       String []arr = pattern.split(" ");
       if (s.length() != arr.length)
       {
           return false;
       }
       else {
           HashMap<Character, String> hm = new HashMap<>();
           HashMap<String, Character> hm1 = new HashMap<>();
           for (int i = 0; i < s.length(); i++) {
               if (!hm.containsKey(s.charAt(i))) {
                   System.out.println("hashmap: "+i+" "+s.charAt(i)+"  "+arr[i]);
                   hm.put(s.charAt(i), arr[i]);
               }
               else if (!hm.get(s.charAt(i)).equals(arr[i])) {
                   System.out.println("hashmap else: "+i+" "+s.charAt(i)+"  "+arr[i]);

                   return false;
               }
               else{
                   System.out.println("hashmap 2nd else: "+i+" "+s.charAt(i)+"  "+arr[i]);
               }
           }
           return true;
       }
      /*  String arr[] = pattern.split(" ");
        if(s.length()!=arr.length){
            System.out.println("String length is not same"+s +" "+pattern);
            return false;
        }
        else{
            HashMap<Character,String> hm = new HashMap<>();
            for(int i=0; i<= s.length(); i++){
                if(!hm.containsKey(s.charAt(i)))
                {
                    System.out.println(s.charAt(i)+"  "+arr[i]);
                    hm.put(s.charAt(i), arr[i]);
                }
                else{
                       if(hm.get(s.charAt(i))==arr[i]){
                        System.out.println(" hm value arrelseif "+hm.get(s.charAt(i)) +" "+arr[i]);
                        System.out.println(s.charAt(i)+"  "+arr[i]);
                        return true;
                    }
                      else{
                    System.out.println(" hm value arr if "+s.charAt(i) +" "+arr[i]);

                    System.out.println(s.charAt(i)+"  "+arr[i]);
                    return false;
                }

                }
            }
        }
        return true;

       */

    }
}
