package com.enock;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection_ofTwo_Arrays {
    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 2, 1};
//        int[] nums2 = {2, 2};
        int[] nums1 = {1, 3, 5, 7, 7};
        int[] nums2 = {2, 3, 3, 5, 8};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();

        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int position = 0;

        for (int number : nums1){
            set1.add(number);
        }
        for (int number : nums2){
            if (set1.contains(number)){
                result[position] = number;
                set1.remove(number);
                position++;
            }
        }

        return Arrays.copyOf(result, position);
    }
}
// Time:  O(n + m)
// Space:  O(min(N, M)) auxiliary si since it depend on the smaller length it can be O(n).
