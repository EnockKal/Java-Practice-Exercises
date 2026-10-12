package com.enock;

import java.util.HashMap;
import java.util.Map;

public class First_Unique_Character {
    public static void main(String[] args) {
        String s = "";

        System.out.println(firstUniqueCharacter(s));
    }

    private static int firstUniqueCharacter(String s) {
        Map<Character, Integer> map = new HashMap<>(); // O(n)

        for (char ch : s.toCharArray()){ // O(n)
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++){ // O(n)
            if (map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
//Time: O(n) + O(n) = O(n)
//Space: O(n) map grow with input
