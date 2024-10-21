import java.util.Arrays;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        // Sort the input array
        Arrays.sort(nums);
        
        int n = nums.length;
        int[][] result = new int[n / 3][3];
        int index = 0;

        // Try to group elements into arrays of size 3
        for (int i = 0; i < n; i += 3) {
            // Check if the difference between the first and the last element in the group is within the limit
            if (nums[i + 2] - nums[i] > k) {
                return new int[0][]; // Return empty array if condition is not satisfied
            }
            // If satisfied, add the group to the result
            result[index++] = new int[] { nums[i], nums[i + 1], nums[i + 2] };
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {1, 3, 4, 8, 7, 9, 3, 5, 1};
        int k1 = 2;
        int[][] result1 = solution.divideArray(nums1, k1);
        System.out.println(Arrays.deepToString(result1)); // Output: [[1,1,3],[3,4,5],[7,8,9]]

        // Test case 2
        int[] nums2 = {2, 4, 2, 2, 5, 2};
        int k2 = 2;
        int[][] result2 = solution.divideArray(nums2, k2);
        System.out.println(Arrays.deepToString(result2)); // Output: []

        // Test case 3
        int[] nums3 = {4, 2, 9, 8, 2, 12, 7, 12, 10, 5, 8, 5, 5, 7, 9, 2, 5, 11};
        int k3 = 14;
        int[][] result3 = solution.divideArray(nums3, k3);
        System.out.println(Arrays.deepToString(result3)); // Output: [[2,2,12],[4,8,5],[5,7,9],[5,9,10],[11,12,2],[5,7,8]]
    }
}
