class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        
        // Iterate until we reach the end of either array
        while (i < nums1.length && j < nums2.length) {
            // Check if the current elements are the same
            if (nums1[i] == nums2[j]) {
                return nums1[i]; // Return the common element
            }
            // Move the pointer in the array with the smaller element
            if (nums1[i] < nums2[j]) {
                i++; // Move pointer in nums1
            } else {
                j++; // Move pointer in nums2
            }
        }
        
        // If no common element was found, return -1
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4};
        System.out.println(solution.getCommon(nums1, nums2)); // Output: 2

        // Test case 2
        int[] nums1_2 = {1, 2, 3, 6};
        int[] nums2_2 = {2, 3, 4, 5};
        System.out.println(solution.getCommon(nums1_2, nums2_2)); // Output: 2

        // Additional test case
        int[] nums1_3 = {1, 2, 5};
        int[] nums2_3 = {3, 4, 6};
        System.out.println(solution.getCommon(nums1_3, nums2_3)); // Output: -1
    }
}
