package com.practice.java;

public class shiftingLetters {

    public static void main(String[] args) {
       String s = "abc";
        int []shifts = {3,5,9};
        shiftingLetter(s, shifts);
    }

    public static String shiftingLetter(String s, int[] shifts) {
        char [] ch = s.toCharArray();
        int l =0;
        for(int i =0; i<=shifts.length-1;i++){
            for(int j = i+1; j<shifts.length; j++){
                shifts[i]=shifts[i]%26+shifts[j]%26;
            }
            ch[i] = (char)('a'+(ch[i]-'a'+shifts[i])%26);
            System.out.println(ch[i]);
            System.out.println(shifts[i]);
        }
        String str= new String(ch);
        System.out.println("str  "+str);
        return str;
    }
}



/**You are given a string s of lowercase English letters and an integer array shifts of the same length.

 Call the shift() of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a').

 For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.
 Now for each shifts[i] = x, we want to shift the first i + 1 letters of s, x times.

 Return the final string after all such shifts to s are applied.



 Example 1:

 Input: s = "abc", shifts = [3,5,9]
 Output: "rpl"
 Explanation: We start with "abc".
 After shifting the first 1 letters of s by 3, we have "dbc".
 After shifting the first 2 letters of s by 5, we have "igc".
 After shifting the first 3 letters of s by 9, we have "rpl", the answer.
 Example 2:

 Input: s = "aaa", shifts = [1,2,3]
 Output: "gfd"


 Constraints:

 1 <= s.length <= 105
 s consists of lowercase English letters.
 shifts.length == s.length
 0 <= shifts[i] <= 109*/
