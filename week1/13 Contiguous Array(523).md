```java
import java.util.HashMap;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Handle the case where a subarray starts from index 0
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) {
                sum %= k; // Take modulo k
            }
            if (map.containsKey(sum)) {
                if (i - map.get(sum) > 1) { // Check the length of the subarray
                    return true;
                }
            } else {
                map.put(sum, i); // Store the index of the first occurrence of the sum
            }
        }
        return false;
    }
}

```