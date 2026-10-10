package com.enock;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s = "pwwkew";

        System.out.println(longestSubstring(s));
    }

    private static int longestSubstring(String s) {
        Set<Character> set = new HashSet<>(); // O(1) bcz of the fixed ASCII alphabet

        int left = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++){ // O(n)
            while (set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(i));

            int currentLength = i - left + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
    }
}
// time: O(n)
// space: O(1) bcz of the fixed ASCII alphabet (the array always has 128 elements)
