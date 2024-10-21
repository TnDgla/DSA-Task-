import java.util.HashMap;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1); // To handle the case where sum up to the current index is a multiple of k
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            // If k is not zero, take the modulo
            if (k != 0) {
                currentSum %= k;
            }

            // Check if this remainder has been seen before
            if (remainderMap.containsKey(currentSum)) {
                // Ensure the subarray length is at least 2
                if (i - remainderMap.get(currentSum) > 1) {
                    return true;
                }
            } else {
                // Store the first occurrence of this remainder
                remainderMap.put(currentSum, i);
            }
        }

        return false; // No valid subarray found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {23, 2, 4, 6, 7};
        int k1 = 6;
        System.out.println(solution.checkSubarraySum(nums1, k1)); // Output: true

        // Test case 2
        int[] nums2 = {23, 2, 6, 4, 7};
        int k2 = 6;
        System.out.println(solution.checkSubarraySum(nums2, k2)); // Output: true

        // Test case 3
        int[] nums3 = {23, 2, 6, 4, 7};
        int k3 = 13;
        System.out.println(solution.checkSubarraySum(nums3, k3)); // Output: false

        // Additional Test case
        int[] nums4 = {0, 0};
        int k4 = 0;
        System.out.println(solution.checkSubarraySum(nums4, k4)); // Output: true
    }
}
