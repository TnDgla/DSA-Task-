class Solution {
    public int maxProduct(int[] nums) {
        // Initialize the variables
        int maxProd = nums[0]; // Maximum product so far
        int currentMax = nums[0]; // Maximum product ending at the current position
        int currentMin = nums[0]; // Minimum product ending at the current position

        // Iterate through the array starting from index 1
        for (int i = 1; i < nums.length; i++) {
            // Store the current number
            int num = nums[i];

            // If the current number is negative, swap the max and min
            if (num < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            // Calculate the current maximum and minimum products
            currentMax = Math.max(num, currentMax * num);
            currentMin = Math.min(num, currentMin * num);

            // Update the global maximum product
            maxProd = Math.max(maxProd, currentMax);
        }

        return maxProd; // Return the maximum product found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {2, 3, -2, 4};
        System.out.println(solution.maxProduct(nums1)); // Expected Output: 6

        // Test case 2
        int[] nums2 = {-2, 0, -1};
        System.out.println(solution.maxProduct(nums2)); // Expected Output: 0
    }
}
