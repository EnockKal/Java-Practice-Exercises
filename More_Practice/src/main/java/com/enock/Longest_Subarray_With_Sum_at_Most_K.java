package com.enock;

public class Longest_Subarray_With_Sum_at_Most_K {
    public static void main(String[] args) {
//        int[] nums = {4, 1, 1, 1, 2, 3, 1};
//        int k = 5;
        int[] nums = {2, 1, 3, 2, 1, 1, 4};
        int k = 6;

        System.out.println(longestSubarray(nums, k));
    }

    public static int longestSubarray(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int longestLength = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];

            while (sum > k){
                sum -= nums[left];
                left++;
            }

            int currentLength = i - left + 1;
            longestLength = Math.max(currentLength, longestLength);
        }

        return longestLength;
    }
}
// time: O(n) both loops traverse the array only once
// space O(1)