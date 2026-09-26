package com.enock;

public class Binary_Search {
    public static void main(String[] args) {
//        int[] nums = {-1, 0, 3, 5, 9, 12};
//        int target = 9;
        int[] nums = {2,  5,  8, 12, 16, 23, 38, 56, 72};
        int target = 23;
        System.out.println(binarySearch(nums, target));
    }

    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int middle = left + (right - left) / 2;
            // int middle = (left + right) / 2;    // same thing, just not safer for lower and higher number.
            if (nums[middle] == target) return middle;

            if (nums[middle] < target){ left = middle + 1;}

            if (nums[middle] > target){ right = middle - 1; }
        }

        return -1; //target not found
    }
}
