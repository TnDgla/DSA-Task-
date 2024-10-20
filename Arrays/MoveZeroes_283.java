package Arrays;

import java.util.Arrays;

public class MoveZeroes_283 {
    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[count++] = num;
            }
        }
        while (count < nums.length) {
            nums[count++] = 0;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 0, 3, 0, 4, 0 };
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}