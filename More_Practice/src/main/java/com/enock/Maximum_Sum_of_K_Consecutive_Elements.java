package com.enock;

public class Maximum_Sum_of_K_Consecutive_Elements {
    public static void main(String[] args) {
        int[] nums = {-5, -2, -8, -1};
        int k = 2;

        System.out.println(maxSum(nums, k));
    }

    private static int maxSum(int[] nums, int k) {
        int window = 0;
        int maxSum = nums.length + 1;

        for (int i = 0; i < k; i++){
            window += nums[i];
        }
        maxSum = window;

        for (int i = k; i < nums.length; i++){
            window = window - nums[i - k] + nums[i];

            if (window > maxSum) maxSum = window;
        }

        return maxSum;
    }
}
