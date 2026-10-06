package com.enock;

public class Maximum_Average_SubarrayI {
    public static void main(String[] args) {
//        int[] nums = {1, 12, -5, -6, 50, 3};
        int[] nums = {4, 2, 1, 7, 8, 3};
        int k = 3;
        System.out.println(averageSubarray(nums, k));
    }

    private static double averageSubarray(int[] nums, int k) {
        int currentSum = 0;
        double maxSum;

        for (int i = 0; i < k; i++){ // O(k)
            currentSum += nums[i];
        }
        maxSum = currentSum;

        for (int i = k; i < nums.length; i++){ // O(n - k)
            currentSum = currentSum - nums[i - k] + nums[i];
            if (currentSum > maxSum){
                maxSum = currentSum;
            }
        }

        return maxSum / k;
    }
}
// time: O(k) + O(n - k) = O(n)
// space: O(1)