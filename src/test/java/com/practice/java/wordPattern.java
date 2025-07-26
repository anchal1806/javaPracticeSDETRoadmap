package com.practice.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.



Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false


Constraints:

1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.
 */
public class wordPattern {
    public static void main(String[] args) {
        System.out.println("pattern checking  "+checkWordPattern("abba", "dog cat cat dog"));
        System.out.println("pattern checking  "+checkWordPattern("abbb", "dog cat cat dog"));

    }

     static boolean checkWordPattern(String pattern, String s) {
        String arr[] = s.split(" ");
        if (pattern.length() != arr.length)
        {
            return false;
        }
        else {
            HashMap<Character, String> hm = new HashMap<>();
            Set<String> set = new HashSet<>();
            for (int i = 0; i < pattern.length(); i++) {
                if (!(hm.containsKey(pattern.charAt(i)) && set.contains(arr[i]))) {
                    hm.put(pattern.charAt(i), arr[i]);
                    set.add(arr[i]);
                }
                   else if (hm.get(pattern.charAt(i)) != arr[i]) {
                        return false;
                    }
                System.out.println("hm  "+hm.get(pattern.charAt(i)));
            }
            System.out.println("Hashmap "+hm);
            return true;
        }

    }
}
