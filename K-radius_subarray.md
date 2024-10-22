```java
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        long sum = 0; 
        int windowSize = 2 * k + 1; 

        
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        
        for (int i = 0; i < n; i++) {
            sum += nums[i]; 

            
            if (i >= windowSize - 1) {
                
                ans[i - k] = (int) (sum / windowSize);

                
                sum -= nums[i - windowSize + 1];
            }
        }
        return ans;
    }
}

```