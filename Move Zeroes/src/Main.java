import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        //int[] nums = {0, 0, 1};
        //int[] nums = {1, 2, 3};

        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int insertPos = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        for (int i = insertPos; i < nums.length; i++){
                nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}