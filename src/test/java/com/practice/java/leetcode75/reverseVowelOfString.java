package com.practice.java.leetcode75;

import java.util.HashSet;

public class reverseVowelOfString {
    public static void main(String[] args) {
        String s= "IceCreAm";

             System.out.println("Reversed Vowel of the String "+reverseVowel(s));
    }

    public static String reverseVowel(String s){
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
int j =0;
int k = s.length()-1;
char temp = ' ';
StringBuffer sb = new StringBuffer(s.length());
char[] arr = s.toCharArray();
       while(j<k)
       {
            if(hs.contains(arr[j]) && hs.contains(arr[k])){
                temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j++;
                k--;

            }
            if(!hs.contains(arr[j]) && hs.contains(arr[k])){
                j++;
            }
            if(hs.contains(arr[j]) && !hs.contains(arr[k])){
                k--;
            }
            if(!hs.contains(arr[j]) && !hs.contains(arr[k])){
                k--;
                j++;
            }
        }
       for(int i =0; i<arr.length;i++){
           sb.append(arr[i]);
       }
System.out.println("String  "+s+ "  is  "+sb.toString());
return sb.toString();
    }

}
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

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.*/