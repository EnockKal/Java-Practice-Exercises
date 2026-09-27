package com.enock;

import java.util.Arrays;

public class Move_Zeroes {
    public static void main(String[] args) {
        int[] nums = {0, 5, 0, 2, 8, 0, 3};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }

    private static int[] moveZeroes(int[] nums) {
        int current = 0;
        int insertPosition = 0;

        while (current < nums.length){
            if (nums[current] != 0){
                nums[insertPosition] = nums[current];
                insertPosition++;
            }
            current++;
        }
        while (insertPosition < nums.length){
            nums[insertPosition] = 0;
            insertPosition++;
        }

        return nums;
    }
}
