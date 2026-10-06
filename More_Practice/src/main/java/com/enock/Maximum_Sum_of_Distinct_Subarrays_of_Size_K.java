package com.enock;

import java.util.HashMap;
import java.util.Map;

public class Maximum_Sum_of_Distinct_Subarrays_of_Size_K {
    public static void main(String[] args) {
//        int[] nums = {4, 4, 4};
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
//        int[] nums = {2, 3, 5, 3, 4, 6};
        int k = 3;

        System.out.println(maxSumSubarray(nums, k));
    }

    private static int maxSumSubarray(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int currentSum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++){ // O(k)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            currentSum = currentSum + nums[i];
        }
        if (map.size() == k){
            maxSum = currentSum;
        }


        for (int i = k; i < nums.length; i++){ // O(n - k)
            currentSum = currentSum - nums[i - k] + nums[i];

            map.put(nums[i - k], map.get(nums[i - k]) -1);

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (map.get(nums[i - k]) == 0){
                map.remove(nums[i - k]); // O(1)
            }

            if (map.size() == k) {
                if (currentSum > maxSum)
                    maxSum = currentSum;
            }

        }

        return maxSum;
    }
}
// time: O(k) + O(n - k) = O(n)
// space: O(k) extra memory (map) grow with k. (worse case O(n))
