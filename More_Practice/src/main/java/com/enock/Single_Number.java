package com.enock;

public class Single_Number {
    public static void main(String[] args) {
        int[] nums = {7};

        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        int result = 0;

        for (int number : nums){
            result = result ^ number;
        }
        return result;
    }
}

// time: O(n) space: O(1)
// using map would work as well but it will have space: O(n)
