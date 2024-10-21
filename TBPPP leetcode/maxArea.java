class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate the current area
            int currentHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int currentArea = currentHeight * width;

            // Update maximum area if current is larger
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea; // Return the maximum area found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution.maxArea(height1)); // Expected Output: 49

        // Test case 2
        int[] height2 = {1, 1};
        System.out.println(solution.maxArea(height2)); // Expected Output: 1
    }
}
