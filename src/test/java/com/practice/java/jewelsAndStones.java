package com.practice.java;

import java.util.HashSet;
import java.util.Set;

public class jewelsAndStones {
    public static void main(String[] args) {
        numJewelsInStones("aA","aAAbbbb");
    }
    private static int numJewelsInStones(String jewels, String stones) {
        int counter = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        for (int j = 0; j < stones.length(); j++) {
            if (set.contains(stones.charAt(j))) {
                counter++;
            }

        }
        System.out.println("counter  " + counter);
        return counter;
    }
}
/*You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".



Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0


Constraints:

1 <= jewels.length, stones.length <= 50
jewels and stones consist of only English letters.
All the characters of jewels are unique.*/
