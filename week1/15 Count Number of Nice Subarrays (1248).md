```java
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length; 
        int[] count = new int[n + 1];
        count[0] = 1; 
        int ans = 0; 
        int t = 0; 
        
        for (int x : nums) { 
            t += x & 1; 
            if (t - k >= 0) { 
                ans += count[t - k]; 
            }
            count[t]++; 
        }
        
        return ans; 
    }
}

```