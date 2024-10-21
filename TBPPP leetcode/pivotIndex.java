class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // Calculate right sum
            int rightSum = totalSum - leftSum - nums[i];

            // Check if left sum equals right sum
            if (leftSum == rightSum) {
                return i; // Found the pivot index
            }

            // Update the left sum for the next iteration
            leftSum += nums[i];
        }

        // If no pivot index is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println(solution.pivotIndex(nums1)); // Output: 3

        // Test case 2
        int[] nums2 = {1, 2, 3};
        System.out.println(solution.pivotIndex(nums2)); // Output: -1

        // Test case 3
        int[] nums3 = {2, 1, -1};
        System.out.println(solution.pivotIndex(nums3)); // Output: 0
    }
}
