package com.enock;

import java.util.HashSet;
import java.util.Set;

public class First_Repeated_Number {
    public static void main(String[] args) {
        int[] nums = {7, 7, 2, 2};

        System.out.println(firstRepeated(nums));
    }

    private static int firstRepeated(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums){
            if (set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;
    }
}
// Complexity: Time: O(n), Space: O(n)
