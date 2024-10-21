import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1; // Start pointer just after the current number
            int right = nums.length - 1; // End pointer at the last number

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    // Found a triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for the second number
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicates for the third number
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++; // Move both pointers
                    right--;
                } else if (sum < 0) {
                    left++; // We need a larger sum
                } else {
                    right--; // We need a smaller sum
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println(solution.threeSum(nums1)); // Output: [[-1,-1,2],[-1,0,1]]

        // Test case 2
        int[] nums2 = {0, 1, 1};
        System.out.println(solution.threeSum(nums2)); // Output: []

        // Test case 3
        int[] nums3 = {0, 0, 0};
        System.out.println(solution.threeSum(nums3)); // Output: [[0,0,0]]
    }
}
