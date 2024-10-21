class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    private int atMostK(int[] nums, int k) {
        int count = 0, left = 0, oddCount = 0;

        for (int right = 0; right < nums.length; right++) {
            // Count odd numbers in the current window
            if (nums[right] % 2 == 1) {
                oddCount++;
            }

            // While there are more than k odd numbers, move the left pointer
            while (oddCount > k) {
                if (nums[left] % 2 == 1) {
                    oddCount--;
                }
                left++;
            }

            // Add the number of subarrays that can be formed with the current right pointer
            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {1, 1, 2, 1, 1};
        int k1 = 3;
        System.out.println(solution.numberOfSubarrays(nums1, k1)); // Output: 2

        // Test case 2
        int[] nums2 = {2, 4, 6};
        int k2 = 1;
        System.out.println(solution.numberOfSubarrays(nums2, k2)); // Output: 0

        // Test case 3
        int[] nums3 = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        int k3 = 2;
        System.out.println(solution.numberOfSubarrays(nums3, k3)); // Output: 16
    }
}
