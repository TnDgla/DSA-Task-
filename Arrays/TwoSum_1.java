package Arrays;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum_1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { i, map.get(diff) };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int num[] = twoSum(nums, 9);
        System.out.println(Arrays.toString(num));
    }
}
