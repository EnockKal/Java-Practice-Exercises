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

        for (int i = 0; i < k; i++){  // O(n)
            window += nums[i];
        }
        maxSum = window;

        for (int i = k; i < nums.length; i++){ //O(n)
            window = window - nums[i - k] + nums[i];

            if (window > maxSum) maxSum = window;
        }

        return maxSum;
    }
}
// time: O(n) both array are O(n) so O(n) + O(n) = O(n)
// space O(1) no memory grow with the input




// slower algorithm (time: O(n^2) space: O(1)
//int maxSum = Integer.MIN_VALUE;
//
//    for (int i = 0; i <= nums.length - k; i++) {
//
//int currentSum = 0;
//
//        for (int j = i; j < i + k; j++) {
//currentSum += nums[j];
//        }
//
//        if (currentSum > maxSum) {
//maxSum = currentSum;
//        }
//                }
//
//return maxSum;
