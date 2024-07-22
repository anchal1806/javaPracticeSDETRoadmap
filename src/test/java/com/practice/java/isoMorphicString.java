package com.practice.java;

import java.util.HashMap;

public class isoMorphicString {
    public static void main(String args[]){
        System.out.println("isoMorphic is fun   :" + isIsomorphic("baba","badc"));//false
        System.out.println("isoMorphic is fun   :" + isIsomorphic("badc","baba"));//false
        System.out.println("isoMorphic is fun   :" + isIsomorphic("foo","bar")); //false
        System.out.println("isoMorphic is fun   :" + isIsomorphic("egg","add")); //true
        System.out.println("isoMorphic is fun   :" + isIsomorphic("maple","fable")); //true

    }
    private static Boolean isIsomorphic(String s, String t){
        HashMap<Character,Character> hm =  new HashMap<>();
        HashMap<Character,Character> hm1 = new HashMap<>();
       if(s.length()!=t.length()){
           return false;
       }
       for(int i=0; i<s.length();i++){
           if(!hm.containsKey(s.charAt(i)) && !hm1.containsKey(t.charAt(i))){
               hm.put(s.charAt(i),t.charAt(i));
               hm1.put(t.charAt(i),s.charAt(i));
           }
           else if(!hm.containsKey(s.charAt(i)) && hm1.containsKey(t.charAt(i))){
               return false;
           }
           else if(hm.containsKey(s.charAt(i)) && !hm1.containsKey(t.charAt(i))){
               return false;
           }
           if((hm.get(s.charAt(i))!= null && hm.get(s.charAt(i))!= t.charAt(i)) || (hm1.get(t.charAt(i))!= null && hm1.get(t.charAt(i))!= s.charAt(i))){
               return false;
           }
       }
       return true;
    }
}
