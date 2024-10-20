package Arrays;

import java.util.Arrays;

public class SortColors_75 {
    public static void sortColors(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length - 1;
        while (j <= k) {
            if (nums[j] == 0) {
                swap(nums, j, i);
                i++;
                j++;
            } else if (nums[j] == 2) {
                swap(nums, j, k);
                k--;
            } else if (nums[j] == 1) {
                j++;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 2, 0, 0 };
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

}
