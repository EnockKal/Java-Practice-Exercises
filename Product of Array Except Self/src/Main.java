import java.util.Arrays;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {2,2,3,4};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        int right = 1;

        for (int i = 1; i < nums.length; i++){
            left[i] = nums[i - 1] * left[i - 1];
        }

        for (int i = nums.length - 1; i >= 0; i--){
            left[i] = left[i] * right;
            right *= nums[i];
        }

        return left;
    }
}