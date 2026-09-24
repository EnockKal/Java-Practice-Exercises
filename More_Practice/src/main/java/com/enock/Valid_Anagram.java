package com.enock;

import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }


    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();

        for (char letter : s.toCharArray()){
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }

        for (char letter : t.toCharArray()){
            if (!map.containsKey(letter))
                return false;

            map.put(letter, map.get(letter) - 1);
        }

        for (int freq : map.values()) {
            if (freq != 0)
                return false;
        }

        return true;
    }

    //if the exercise only ask for lowercase letter specifically and nthg else

//    private static boolean isAnagram(String s, String t){
//        if (s.length() != t.length())
//            return false;
//
//        int[] count = new int[26];
//
//        for (char letter : s.toCharArray()){
//            count[letter - 'a']++;
//        }
//
//        for (char letter : t.toCharArray()){
//            count[letter - 'a']--;
//        }
//
//        for (int number : count){
//            if (number != 0)
//                return false;
//        }
//
//        return true;
//    }

}
