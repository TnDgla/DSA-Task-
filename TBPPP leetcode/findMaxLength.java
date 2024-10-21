import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> prefixSumIndex = new HashMap<>();
        prefixSumIndex.put(0, -1); // To handle the case when the whole array is valid
        int maxLength = 0;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Update the prefix sum: treat 0 as -1
            prefixSum += (nums[i] == 0) ? -1 : 1;

            // Check if this prefix sum has been seen before
            if (prefixSumIndex.containsKey(prefixSum)) {
                // Calculate the length of the subarray
                int length = i - prefixSumIndex.get(prefixSum);
                maxLength = Math.max(maxLength, length);
            } else {
                // Store the first occurrence of this prefix sum
                prefixSumIndex.put(prefixSum, i);
            }
        }

        return maxLength; // Return the maximum length found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {0, 1};
        System.out.println(solution.findMaxLength(nums1)); // Output: 2

        // Test case 2
        int[] nums2 = {0, 1, 0};
        System.out.println(solution.findMaxLength(nums2)); // Output: 2

        // Additional Test case
        int[] nums3 = {0, 1, 0, 1, 0, 1, 1};
        System.out.println(solution.findMaxLength(nums3)); // Output: 6
    }
}
