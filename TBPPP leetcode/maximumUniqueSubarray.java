import java.util.HashSet;

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        int maxScore = 0;
        int currentSum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            // Expand the window by including nums[right]
            while (uniqueElements.contains(nums[right])) {
                // Remove elements from the left until nums[right] can be added
                uniqueElements.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
            // Add the current number to the set and the sum
            uniqueElements.add(nums[right]);
            currentSum += nums[right];
            // Update the maximum score
            maxScore = Math.max(maxScore, currentSum);
        }

        return maxScore; // Return the maximum score found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {4, 2, 4, 5, 6};
        System.out.println(solution.maximumUniqueSubarray(nums1)); // Output: 17

        // Test case 2
        int[] nums2 = {5, 2, 1, 2, 5, 2, 1, 2, 5};
        System.out.println(solution.maximumUniqueSubarray(nums2)); // Output: 8
    }
}
