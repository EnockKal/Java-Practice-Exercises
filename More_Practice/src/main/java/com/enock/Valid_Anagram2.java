package com.enock;

public class Valid_Anagram2 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(anagram(s, t));
    }

    private static boolean anagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++){
            count[t.charAt(i) - 'a']--;
        }
        for (int number : count){
            if (number != 0) return false;
        }
        return true;
    }
}
