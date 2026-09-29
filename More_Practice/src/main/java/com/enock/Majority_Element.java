package com.enock;

public class Majority_Element {
    public static void main(String[] args) {
//        int[] nums = {3, 2, 3};
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
//        int[] nums = {4, 4, 2, 4, 3, 4, 4};

        System.out.println(majorityElement(nums));
    }

    // Best solution (Boyer-Moore solution) time: O(n), space: O(1)
    private static int majorityElement(int[] nums){
        int candidate = 0;
        int count = 0;

        for (int number : nums){
            if (count == 0)
                candidate = number;
            if (candidate == number)
                count++;
            else {
                count--;
            }
        }

        return candidate;
    }

        //Hashmap Solution  time: O(n)   space: O(n)
//    private static int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        int target = nums.length / 2;
//
//        for (int number : nums){
//            map.put(number, map.getOrDefault(number, 0) + 1);
//
//            if (map.get(number) > target) {
//                return number;
//            }
//        }
//        return 0;
//    }
}
