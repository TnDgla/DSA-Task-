package prefix sum;
// 525. Contiguous Array
class Solution {
    public int findMaxLength(int[] nums) {
        if (nums.length <= 1) {
            return 0; // If the array has fewer than two elements, there cannot be any subarray with equal numbers of 0s and 1s.
        }

        int maxLength = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Initialize the map with sum 0 at index -1.

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 1 ? 1 : -1; // Convert 0 to -1 and 1 to 1, so when sum is 0, it means equal number of 0s and 1s encountered so far.
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum)); // Update maxLength if the current sum has been seen before.
            } else {
                map.put(sum, i); // Store the index of the first occurrence of a sum in the map.
            }
        }

        return maxLength;
    }
}
