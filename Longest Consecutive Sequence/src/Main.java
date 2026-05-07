import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //int[] nums = {0,3,7,2,5,8,4,6,0,1};
        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums){
            set.add(num);
        }

        int maxCount = 0;

        for (int num : set){
            if (!set.contains(num - 1)){
                int current = 0;
                int currentCount = 1;

                while (set.contains(current + 1)){
                    currentCount++;
                    current++;
                }
                maxCount = Math.max(currentCount, maxCount);
            }
        }
        return maxCount;
    }
}