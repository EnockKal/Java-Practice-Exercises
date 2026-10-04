package com.enock;

import java.util.*;

public class Find_the_Difference_of_Two_Arrays {
    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 2, 5, 7};
//        int[] nums2 = {2, 3, 5, 5, 8};
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {10};

        System.out.println(difference(nums1, nums2));
    }

    private static List<List<Integer>> difference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>(); // O(n)
        Set<Integer> set2 = new HashSet<>(); // O(m)

        List<Integer> result1 = new ArrayList<>(); // O(n)
        List<Integer> result2 = new ArrayList<>(); // O(m)
        List<List<Integer>> resultList = new ArrayList<>(); // O(1)

        for (int number : nums1){
            set1.add(number);
        } // O(n) + O(1) = O(n)

        for (int number : nums2){
            set2.add(number);
        }// O(m) + O(1) = O(m)

        for (int number : set1){
            if (!set2.contains(number)){
                result1.add(number);
            }
        } // O(n) + O(1) = O(n)

        for (int number : set2){
            if (!set1.contains(number)){
                result2.add(number);
            }
        } // O(m) + O(1) = O(m)

        resultList.add(result1); // O(1)
        resultList.add(result2); // O(1)

        return resultList;
    }
}
// time: O(n + m + n + m) + O(1) + O(1) = O(2n + 2m) = O(n + m)
// space: O(n + m) + O(n + m) + O(1) = O(2n + 2m) = O(n + m)
