package com.enock;

public class Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
//        int[] nums = {2, 1, 5, 2, 3, 2};
//        int target = 8;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
//        int[] nums = {1, 2, 3};
//        int target = 20;

        System.out.println(minimumSizeSum(nums, target));
    }

    private static int minimumSizeSum(int[] nums, int target) {
        int currentsum = 0;
        int left = 0;
        int minLength = nums.length + 1;

        for (int i = 0; i < nums.length; i ++){ // O(n)
            currentsum += nums[i];

            while (currentsum >= target){ // O(n)
                int currentLength = i - left + 1;

                if (currentLength < minLength){
                    minLength = currentLength;
                }

                currentsum -= nums[left];
                left++;
            }
        }

        if (minLength == nums.length + 1){
            return 0;
        }
        return minLength;
    }
}
// Time: O(n) + O(n) = O(n) bcz both for and  while loop only move forward... they don't start over
// Space: O(1) bcz no memory grow with the input
