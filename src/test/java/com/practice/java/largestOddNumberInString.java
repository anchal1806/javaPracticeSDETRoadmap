package com.practice.java;

import static java.lang.Integer.parseInt;

public class largestOddNumberInString {
    public static void main(String[] args) {
         System.out.println("Largest odd number is "+largestOddNumber("228"));
    }
    private static int largestOddNumber(String s){
        int value = parseInt(s);
        while(value!=0){
            if(value%2!=0){
                return value;
            }
            value = value/10;
        }
        int max= 0;
        for(int i =0; i<s.length();i++){
            if(max< parseInt(String.valueOf(s.charAt(i))) && parseInt(String.valueOf(s.charAt(i)))%2!=0 ){
                max= parseInt(String.valueOf(s.charAt(i)));
            }

        }
        return max;

    }
}
/*You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.

A substring is a contiguous sequence of characters within a string.



Example 1:

Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
Example 2:

Input: num = "4206"
Output: ""
Explanation: There are no odd numbers in "4206".
Example 3:

Input: num = "35427"
Output: "35427"
Explanation: "35427" is already an odd number.


Constraints:

1 <= num.length <= 105
num only consists of digits and does not contain any leading zeros.*/
