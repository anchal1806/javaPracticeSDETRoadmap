package com.practice.java;

import java.util.HashSet;

/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.



Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"



Constraints:

 */
public class reverseVowelsOnly {

    public static void main(String args[]){
        String s = "Icecream";
        String rev = "acecreIm";
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
        int i =0;
        int j = s.length()-1;
        char []arr = s.toCharArray();
        char c= ' ';
        while(i<j){
            if(hs.contains(arr[i]) && hs.contains(arr[j])){
                c= arr[i];
                arr[i] = arr[j];
                arr[j]= c;
                i++;
                j--;
            }
            else if(hs.contains(arr[i]) && !hs.contains(arr[j])){
                j--;
            }
            else if(!hs.contains(arr[i]) && hs.contains(arr[j])){
                i++;
            }
            else if(!hs.contains(arr[i]) && !hs.contains(arr[j])){
                i++;
                j--;
            }

        }
        StringBuffer sb = new StringBuffer(arr.length);
       for(int k=0; k<arr.length;k++  ){
           sb.append(arr[k]);
       }
       System.out.println("  hey  "+sb.toString());

    }
}
