package com.practice.java;

import java.util.HashSet;

public class replaceVowel {
    public static void main(String[] args) {
       String s = "Icecream";
       // String s= "leetcode";
        /*
        acecreIm
        acecreIm
        ecacrIem
        * */
       char[]arr= s.toCharArray();

        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');
        StringBuffer sb = new StringBuffer(s.length());
        char c = ' ';
        int i=0;
        int j=arr.length-1;
        while( i<j){
                System.out.println(" i and j"+i +"  "+j);
                if(hs.contains(s.charAt(i)) && hs.contains(s.charAt(j))){
                   c= arr[i];
                    arr[i]=arr[j];
                    arr[j] = c;
                    i++;
                    j--;
                }
            else if(hs.contains(s.charAt(i)) && !hs.contains(s.charAt(j))){
                j--;
            }
                else if(!hs.contains(s.charAt(i)) && hs.contains(s.charAt(j))){
                    i++;
                }
            else if(!hs.contains(s.charAt(i)) && !hs.contains(s.charAt(j))){
                i++;
                j--;
            }
        }
        for(int k =0; k<arr.length; k++)
        System.out.println("str  "+sb.append(arr[k]));
        System.out.println("str  "+sb.toString());
    }

}
