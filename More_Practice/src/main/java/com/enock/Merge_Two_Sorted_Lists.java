package com.enock;

import java.util.Arrays;

public class Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        int[] nums1 = {1, 4, 7};
        int[] nums2 = {2, 3, 8};
        System.out.println(Arrays.toString(mergeTwoSortedLists(nums1, nums2)));
    }
    private static int[] mergeTwoSortedLists(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];

        int pointer1 = 0;
        int pointer2 = 0;
        int pointerK = 0;

        while (pointer1 < nums1.length && pointer2 < nums2.length){
            if (nums1[pointer1] <= nums2[pointer2]){
                result[pointerK] = nums1[pointer1];
                pointer1++;
                pointerK++;
            }
            else {
                result[pointerK] = nums2[pointer2];
                pointer2++;
                pointerK++;
            }
        }
        while (pointer1 < nums1.length){
            result[pointerK] = nums1[pointer1];
            pointer1++;
            pointerK++;
        }

        while (pointer2 < nums2.length){
            result[pointerK] = nums2[pointer2];
            pointer2++;
            pointerK++;
        }

        return result;
    }
}
