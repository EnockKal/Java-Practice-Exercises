package com.enock;

public class Maximum_Subarray {
    public static void main(String[] args) {
//        int[] nums = {-4, 2};
//        int[] nums = {-4, 2, -1, 3, -5, 4};
        int[] nums = {-5, -2, -8};

        System.out.println(maxSubarray(nums));
    }

    private static int maxSubarray(int[] nums) {
        int currentSum = nums[0]; //O(1)
        int maxSum = nums[0]; //O(1)

        for (int i = 1; i < nums.length; i++){ // O(n)
            if (currentSum + nums[i] < nums[i]){
                currentSum = nums[i];
            }
            else {
                currentSum = currentSum + nums[i];
            }

            if (currentSum > maxSum)
                maxSum = currentSum;
        }

        return maxSum;
    }
}
// time: O(n) bcz the array is being traverse only once (by the loop) and everything else insde the loop is O(1) or constant.
// space: O(1) bcz there's only one fix number of variable, nthg get affected by the input
