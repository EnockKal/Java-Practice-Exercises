package com.enock;

import java.util.HashSet;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
//        int nums = {1, 2, 3, 1};
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int number : nums){
            if (set.contains(number))
                return true;

            set.add(number);
        }

        return false;
    }
}
