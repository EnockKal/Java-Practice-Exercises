package com.enock;

import java.util.HashMap;
import java.util.Map;

public class Longest_Subarray_With_At_Most_K_Distinct_Integers {
    public static void main(String[] args) {
        //            1  2  3  4
        int[] nums = {1, 2, 1, 3, 4};
//        int[] nums = {1, 1, 2, 2, 3, 3};
        int k = 2;

        System.out.println(longestSubarray(nums, k));
    }

    private static int longestSubarray(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); // O(n)

        int left = 0;
        int longestSub = 0;

        for (int i = 0; i < nums.length; i++){  // O(n)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            while (map.size() > k){ // O(n)
                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }

            longestSub = Math.max(longestSub, i - left + 1);
        }

        return longestSub;
    }
}
// time: O(n) both loop move forward so we don't multiply them we add them
// Space: O(n) the map grow with the input
