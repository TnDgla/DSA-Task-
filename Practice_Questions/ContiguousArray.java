import java.util.HashMap;

public class ContiguousArray {
    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 

        int maxLength = 0;
        int runningSum = 0;

        for (int i = 0; i < nums.length; i++) {
            runningSum += (nums[i] == 0) ? -1 : 1;

            if (map.containsKey(runningSum)) {
                int prevIndex = map.get(runningSum);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                map.put(runningSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1};
        System.out.println("Max Length of Contiguous Subarray: " + findMaxLength(nums1)); // Output: 2

        int[] nums2 = {0, 1, 0};
        System.out.println("Max Length of Contiguous Subarray: " + findMaxLength(nums2)); // Output: 2
    }
}
