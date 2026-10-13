package com.enock;

import java.util.HashMap;
import java.util.Map;

public class First_NonRepeating_Character {
    public static void main(String[] args) {
        String s = "aarbbcddce";

        System.out.println(firstNonRepeatingCharacter(s));
    }

    private static int firstNonRepeatingCharacter(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char character : s.toCharArray()){
            map.put(character, map.getOrDefault(character, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++){
            if (map.get(s.charAt(i)) == 1)
                return i;
        }

        return -1;
    }
}
