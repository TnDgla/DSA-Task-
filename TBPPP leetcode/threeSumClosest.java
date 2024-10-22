import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize closest sum
        
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1; // Start pointer
            int right = nums.length - 1; // End pointer
            
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                // Check if we found a closer sum
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum; // Update closest sum
                }
                
                // If we find an exact match, return it
                if (currentSum == target) {
                    return currentSum;
                }
                
                // Move the pointers based on comparison with the target
                if (currentSum < target) {
                    left++; // We need a larger sum
                } else {
                    right--; // We need a smaller sum
                }
            }
        }
        
        return closestSum; // Return the closest sum found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println(solution.threeSumClosest(nums1, target1)); // Output: 2

        // Test case 2
        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        System.out.println(solution.threeSumClosest(nums2, target2)); // Output: 0
    }
}
