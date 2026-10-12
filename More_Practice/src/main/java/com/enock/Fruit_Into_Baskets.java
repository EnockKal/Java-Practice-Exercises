package com.enock;

import java.util.HashMap;
import java.util.Map;

public class Fruit_Into_Baskets {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2};

        System.out.println(maxNumberOfFruit(nums));
    }

    private static int maxNumberOfFruit(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int maxFruits = 0;
        int left = 0;

        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            while (map.size() > 2){
                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0)
                    map.remove(nums[left]);

                left++;
            }

            maxFruits = Math.max(maxFruits, i - left + 1);
        }
        return maxFruits;
    }
}
// similar to Longest_Subarray_With_At_Most_K_Distinct_Integers but different in space bcz of a set amount of type fruits
// time: O(n) both loop move forward so we don't multiply them we add them
// Space: O(1) bcz we know the map can only hold 3 type of fruit at most during process
