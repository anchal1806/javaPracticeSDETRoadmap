package com.practice.java;

import java.util.HashMap;

import static com.google.gson.JsonParser.parseString;

public class sumOfDigitsAfterStringConverts {
    public static void main(String[] args) {
         // sumOfDigits("axjs", 2);
       //   sumOfDigits("zbax",3);
        //  sumOfDigits("leetcode",2);
          sumOfDigits("dbvmfhnttvr",5);
    }

    private static int sumOfDigits(String s, int k){
  HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('a',1);
        hm.put('b',2);
        hm.put('c',3);
        hm.put('d',4);
        hm.put('e',5);
        hm.put('f',6);
        hm.put('g',7);
        hm.put('h',8);
        hm.put('i',9);
        hm.put('j',10);
        hm.put('k',11);
        hm.put('l',12);
        hm.put('m',13);
        hm.put('n',14);
        hm.put('o',15);
        hm.put('p',16);
        hm.put('q',17);
        hm.put('r',18);
        hm.put('s',19);
        hm.put('t',20);
        hm.put('u',21);
        hm.put('v',22);
        hm.put('w',23);
        hm.put('x',24);
        hm.put('y',25);
        hm.put('z',26);
        StringBuffer sb = new StringBuffer(s.length());
        for(int i =0;i<s.length();i++){
              sb.append(hm.get(s.charAt(i)));
        }
        System.out.println(sb);
        int value =0;
        int value1=0;
         if(k>0) {
             for (int i = 0; i < sb.length(); i++) {
                 value = value + Integer.parseInt(String.valueOf(sb.charAt(i)));
             }
             System.out.println("value after for "+value);

             k = k - 1;
             while (k > 0) {
                 while (value > 0) {
                     value1 = value1 + value % 10;
                     value = value / 10;
                 }
                 value = value1;
                 value1=0;
                 System.out.println(value);
                 k--;
             }
             System.out.println(value);
             return value;
         }

         else{
             System.out.println(Integer.parseInt(sb.toString()));
             return Integer.parseInt(sb.toString());
         }





    }

}




    /*You are given a string s consisting of lowercase English letters, and an integer k. Your task is to convert the string into an integer by a special process, and then transform it by summing its digits repeatedly k times. More specifically, perform the following steps:

Convert s into an integer by replacing each letter with its position in the alphabet (i.e. replace 'a' with 1, 'b' with 2, ..., 'z' with 26).
Transform the integer by replacing it with the sum of its digits.
Repeat the transform operation (step 2) k times in total.
For example, if s = "zbax" and k = 2, then the resulting integer would be 8 by the following operations:

Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
Transform #2: 17 ➝ 1 + 7 ➝ 8
Return the resulting integer after performing the operations described above.



Example 1:

Input: s = "iiii", k = 1

Output: 36

Explanation:

The operations are as follows:
- Convert: "iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
- Transform #1: 9999 ➝ 9 + 9 + 9 + 9 ➝ 36
Thus the resulting integer is 36.

Example 2:

Input: s = "leetcode", k = 2

Output: 6

Explanation:

The operations are as follows:
- Convert: "leetcode" ➝ "(12)(5)(5)(20)(3)(15)(4)(5)" ➝ "12552031545" ➝ 12552031545
- Transform #1: 12552031545 ➝ 1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5 ➝ 33
- Transform #2: 33 ➝ 3 + 3 ➝ 6
Thus the resulting integer is 6.

Example 3:

Input: s = "zbax", k = 2

Output: 8



Constraints:

1 <= s.length <= 100
1 <= k <= 10
s consists of lowercase English letters.*/



