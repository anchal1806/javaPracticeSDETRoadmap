package com.practice.java;

import java.util.HashMap;

public class romanToInteger {
    public static void main(String args[]){
        //String roman = "LVIII"; //58
    //    String roman = "MCMXCIV"; //1994
        String roman = "XIX"; //1994

        romanToInteger RTI = new romanToInteger();
        System.out.println(RTI.romanFunction(roman));
    }
    private int romanFunction(String s){
        int romanInteger =0;
        HashMap<Character, Integer>hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        for(int i=0; i<s.length();i++){
            if(i<s.length()-1){
                if(hm.get(s.charAt(i+1))>hm.get(s.charAt(i))){
                    romanInteger = romanInteger+hm.get(s.charAt(i+1))-hm.get(s.charAt(i));
                    i++;
                }
                else{
                    romanInteger = romanInteger+hm.get(s.charAt(i));
                }

                }
            else if(i==s.length()-1){
                romanInteger = romanInteger+hm.get(s.charAt(i));
            }
            }
        return romanInteger;
        }

}
