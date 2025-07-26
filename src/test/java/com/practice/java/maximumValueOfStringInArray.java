package com.practice.java;

public class maximumValueOfStringInArray {

    public static void main(String[] args) {
        String[] strs = {"ali3", "bob", "6", "4", "000001111"};
        String[] strs1 =  {"1","01","001","0001"};
        maxValueOfString(strs);
        maxValueOfString(strs1);
    }

    private static int maxValueOfString(String[] strs) {
        int max = 0;
        int numeric = 0;
        int alphabet = 0;
        int temp =0;

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                if (strs[i].charAt(j)>=47 && strs[i].charAt(j)<=98){
                    numeric =1;
                }
                else if (strs[i].charAt(j)>=65 && strs[i].charAt(j)<=97 ||strs[i].charAt(j)>=97 && strs[i].charAt(j)<=122){
                    alphabet = 1;
                }
            }

          //  System.out.println("numeric "+numeric);
           // System.out.println("alphabet "+alphabet);

            if(alphabet ==1 && numeric ==1){
                temp = strs[i].length();
            } else if (alphabet ==1 && numeric ==0) {
                temp = strs[i].length();
            } else if (alphabet ==0 && numeric ==1) {
               temp= Integer.parseInt(strs[i]);
            }

            if(temp>max){
                max=temp;
            }
            numeric =0;
            alphabet=0;
        }
        System.out.println(" max   " + max);
return max;
    }
}
/*The value of an alphanumeric string can be defined as:

The numeric representation of the string in base 10, if it comprises of digits only.
The length of the string, otherwise.
Given an array strs of alphanumeric strings, return the maximum value of any string in strs.



Example 1:

Input: strs = ["alic3","bob","3","4","00000"]
Output: 5
Explanation:
- "alic3" consists of both letters and digits, so its value is its length, i.e. 5.
- "bob" consists only of letters, so its value is also its length, i.e. 3.
- "3" consists only of digits, so its value is its numeric equivalent, i.e. 3.
- "4" also consists only of digits, so its value is 4.
- "00000" consists only of digits, so its value is 0.
Hence, the maximum value is 5, of "alic3".
Example 2:

Input: strs = ["1","01","001","0001"]
Output: 1
Explanation:
Each string in the array has value 1. Hence, we return 1.


Constraints:

1 <= strs.length <= 100
1 <= strs[i].length <= 9
strs[i] consists of only lowercase English letters and digits.*/
