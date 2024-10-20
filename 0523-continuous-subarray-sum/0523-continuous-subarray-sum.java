import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Hash map to store the first occurrence of each remainder
        Map<Integer, Integer> remainderMap = new HashMap<>();
        // Initialize with remainder 0 at index -1 to handle the case of subarray starting at index 0
        remainderMap.put(0, -1);
        
        int prefixSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int remainder = prefixSum % k;
            
            // Adjust remainder to be positive if it's negative (Java's % can return negative)
            if (remainder < 0) {
                remainder += k;
            }
            
            if (remainderMap.containsKey(remainder)) {
                // If the same remainder has been seen before, check the subarray length
                if (i - remainderMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                // Store the index of the first occurrence of this remainder
                remainderMap.put(remainder, i);
            }
        }
        
        return false;
    }
}