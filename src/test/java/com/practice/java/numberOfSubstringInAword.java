package com.practice.java;

public class numberOfSubstringInAword {
    public static void main(String[] args) {
        String [] patterns = {"a","abc","bc","d"};
             String word = "abc";
        numberOfSubstring(patterns,word);
      /*  String []  patterns1 = {"a","b","c"};
        String  word1 = "aaaaabbbbb";
        numberOfSubstring(patterns1,word1);*/

      /*  String []  patterns1 = {"cjevwg"};
        String  word1 = "jevwg";
        numberOfSubstring(patterns1,word1);
*/
        String []  patterns2 = {"dgvyb","j","rc","b","gve","rkbzd","i","ial","tws","c","z"};
String word2="zcobp";
        numberOfSubstring(patterns2,word2);


    }
    private static int numberOfSubstring(String[] patterns,String word){
        int counter =0;
        int wordSize = word.length();
        int k =0;
        String str ="";
        int wordCurrentSize =0;
        for(int i=0; i<patterns.length; i++){
            str = patterns[i];
             wordCurrentSize =0;
            k=0;
            if(str.length()>word.length()){
                break;
            }
            while(wordCurrentSize != wordSize-1){

                System.out.println(i +"   " +k +" "+word.substring(k,k+str.length()) +" "+str +" "+str.length());

                if(word.substring(k,k+str.length()).equals(str)){
                  counter++;
                  break;
              }
              else {
                  k++;
              }
                wordCurrentSize++;
            }
            }

        System.out.println("counter "+counter);
        return counter;
    }
}

/*Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.

A substring is a contiguous sequence of characters within a string.



Example 1:

Input: patterns = ["a","abc","bc","d"], word = "abc"
Output: 3
Explanation:
- "a" appears as a substring in "abc".
- "abc" appears as a substring in "abc".
- "bc" appears as a substring in "abc".
- "d" does not appear as a substring in "abc".
3 of the strings in patterns appear as a substring in word.
Example 2:

Input: patterns = ["a","b","c"], word = "aaaaabbbbb"
Output: 2
Explanation:
- "a" appears as a substring in "aaaaabbbbb".
- "b" appears as a substring in "aaaaabbbbb".
- "c" does not appear as a substring in "aaaaabbbbb".
2 of the strings in patterns appear as a substring in word.
Example 3:

Input: patterns = ["a","a","a"], word = "ab"
Output: 3
Explanation: Each of the patterns appears as a substring in word "ab".


Constraints:

1 <= patterns.length <= 100
1 <= patterns[i].length <= 100
1 <= word.length <= 100
patterns[i] and word consist of lowercase English letters.*/
