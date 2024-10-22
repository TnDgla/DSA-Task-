import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> cumulativeSumCount = new HashMap<>();
        cumulativeSumCount.put(0, 1); // Initialize with sum 0 to handle the case when the sum equals k
        int count = 0;
        int cumulativeSum = 0;

        for (int num : nums) {
            cumulativeSum += num; // Update the cumulative sum

            // Check if there exists a subarray that sums to k
            if (cumulativeSumCount.containsKey(cumulativeSum - k)) {
                count += cumulativeSumCount.get(cumulativeSum - k);
            }

            // Update the hashmap with the current cumulative sum
            cumulativeSumCount.put(cumulativeSum, cumulativeSumCount.getOrDefault(cumulativeSum, 0) + 1);
        }

        return count;
    }
}
