import java.util.Arrays;
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avgs = new int[n];

        // Fill the output array with -1 initially
        for (int i = 0; i < n; i++) {
            avgs[i] = -1;
        }

        // If k is too large, return the avgs array which is all -1
        if (k == 0) {
            for (int i = 0; i < n; i++) {
                avgs[i] = nums[i]; // If k is 0, the average is the element itself
            }
            return avgs;
        }

        // Calculate the sum for the first window
        long sum = 0;
        // Check if there are enough elements to calculate the first average
        if (2 * k + 1 <= n) {
            for (int i = 0; i < 2 * k + 1; i++) {
                sum += nums[i];
            }

            // Fill the averages for valid indices
            for (int i = k; i < n - k; i++) {
                avgs[i] = (int) (sum / (2 * k + 1)); // Integer division

                // Update the sum for the next position
                if (i + k + 1 < n) {
                    sum += nums[i + k + 1]; // Add the next element in the window
                }
                if (i - k >= 0) {
                    sum -= nums[i - k]; // Remove the element that's exiting the window
                }
            }
        }

        return avgs; // Return the resulting averages array
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k1 = 3;
        int[] result1 = solution.getAverages(nums1, k1);
        System.out.println(Arrays.toString(result1)); // Expected Output: [-1,-1,-1,5,4,4,-1,-1,-1]

        // Test case 2
        int[] nums2 = {100000};
        int k2 = 0;
        int[] result2 = solution.getAverages(nums2, k2);
        System.out.println(Arrays.toString(result2)); // Expected Output: [100000]

        // Test case 3
        int[] nums3 = {8};
        int k3 = 100000;
        int[] result3 = solution.getAverages(nums3, k3);
        System.out.println(Arrays.toString(result3)); // Expected Output: [-1]
    }
}
