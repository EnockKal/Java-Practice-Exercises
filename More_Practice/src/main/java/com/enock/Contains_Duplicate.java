package com.enock;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    public static void main(String[] args) {
//        int [] nums = {1, 2, 3, 1};
        int [] nums = {1, 2, 3, 4};
//        int [] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int [] nums){
//        hashset solution
//        Set<Integer> set = new HashSet<>();
//
//        for (int num : nums){
//            if (set.contains(num))
//                return true;
//
//            set.add(num);
//        }
//
//        return false;

//        Sorting Solution
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                return true;
            }
        }

        return false;
    }
}

