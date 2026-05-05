import java.util.Arrays;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            int product = 1;

            for (int j = 0; j < nums.length; j++){
                if (i != j){
                    product *= nums[j];
                }
            }
            result[i] = product;
        }

        return result;
    }
}