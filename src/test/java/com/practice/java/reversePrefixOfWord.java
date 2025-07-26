package com.practice.java;

import java.util.Arrays;

public class reversePrefixOfWord {
    public static void main(String[] args) {
        reversalPrefix("abcdefd" , 'd');
        reversalPrefix("xyxzxe", 'z');
        reversalPrefix("abcde",  'z');
    }

    private static String reversalPrefix(String word, char ch) {
       char arr[] = word.toCharArray();

        int index = 0;
        int j = 0;
        char temp;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == ch) {
                index = i;
              //  System.out.println("index "+i);
                break;
            }
        }
        while (index > j) {
            temp = arr[index];
            arr[index] = arr[j];
            arr[j] = temp;
            System.out.println(" "+ arr[index]);
            System.out.println("    "+ arr[j]);
            index--;
            j++;
            System.out.println("index "+index);
            System.out.println("j"+j);

        }
        StringBuffer sb = new StringBuffer(arr.length);
        for(int i =0; i< arr.length;i++){
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());
        return sb.toString() ;
    }
}
/*Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.



Example 1:

Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
Example 2:

Input: word = "xyxzxe", ch = "z"
Output: "zxyxxe"
Explanation: The first and only occurrence of "z" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
Example 3:

Input: word "xyxzxe", ch = "z"
Output: "abcd"
Explanation: "z" does not exist in word.
You should not do any reverse operation, the resulting string is "abcd".


Constraints:

1 <= word.length <= 250
word consists of lowercase English letters.
ch is a lowercase English letter.*/