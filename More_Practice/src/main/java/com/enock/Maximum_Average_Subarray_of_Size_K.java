package com.enock;

public class Maximum_Average_Subarray_of_Size_K {
    public static void main(String[] args) {
        int[] nums = {-3, -5, -2, -8};
        int k = 2;

        System.out.println(maxAverage(nums, k));
    }

    private static double maxAverage(int[] nums, int k) {
        int window = 0;
        double maxAverage;

        for (int i = 0; i < k; i++){  // O(k)
            window += nums[i];
        }
        maxAverage = window;

        for (int i = k; i < nums.length; i++){  // O(n - k)
            window = window - nums[i - k] + nums[i];

            if (maxAverage < window)
                maxAverage = window;
        }

        return maxAverage / k;
    }
}
// time: O(n) both array are: O(k) + O(n - k) = O(n)
// space O(1) no memory grow with the input
