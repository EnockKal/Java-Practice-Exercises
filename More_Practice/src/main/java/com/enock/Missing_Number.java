package com.enock;

public class Missing_Number {
    public static void main(String[] args) {
//        int[] nums = {3, 0, 1};
//        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] nums = {0, 1, 3, 4, 5};

        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++){
            result ^= i;
            result ^= nums[i];
        }

        result ^= nums.length;

        return result;
    }
}
// Time: O(n) because the loop traverses the n elements once
// Space: O(1) because the extra variables (result and i) use a fixed amount of memory regardless of the size of nums
