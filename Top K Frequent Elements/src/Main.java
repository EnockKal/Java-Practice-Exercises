import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //int[] nums = {1,1,1,2,2,3};
        int[] nums = {5,5,6,6,7,7,7};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequentElements(nums, k)));
    }

    public static int[] topKFrequentElements(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        int[] result = new int[k];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        queue.addAll(map.keySet());

        for (int i = 0; i < k; i++){
            result[i] = queue.poll();
        }

        return result;
    }
}