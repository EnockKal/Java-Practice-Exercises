package com.enock;

public class Minimum_Size_Subarray_Sum_ {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 11;

        System.out.println(minimumSize(nums, target));
    }

    private static int minimumSize(int[] nums, int target) {
        int window = 0;
        int left = 0;
        int minSum = nums.length + 1;

        for (int i = 0; i < nums.length; i++){
            window += nums[i];

            while (window >= target){
                int currentLength = i - left + 1;

                if (currentLength < minSum){
                    minSum = currentLength;
                }

                window -= nums[left];
                left++;
            }
        }

        if (minSum == nums.length + 1) {
            return 0;
        }
        return minSum;
    }
}
