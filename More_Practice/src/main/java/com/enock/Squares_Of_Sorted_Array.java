package com.enock;

import java.util.Arrays;

public class Squares_Of_Sorted_Array {
    public static void main(String[] args) {
        //int[] nums = {-8, -2, 1, 4, 6};
        int[] nums = {-16, -1, 0, 9, 100};
        System.out.println(Arrays.toString(squaresOfSortedArray(nums)));
    }

    private static int[] squaresOfSortedArray(int[] nums) {
        int[] newArray = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int position = newArray.length - 1;

        while (left <= right){
            int squareLeft = nums[left] * nums[left];
            int squareRight = nums[right] * nums[right];
            if (squareLeft >= squareRight){
                newArray[position] = squareLeft;
                position--;
                left++;
            }
            else {
                newArray[position] = squareRight;
                position--;
                right--;
            }
        }

        return newArray;
    }
}
