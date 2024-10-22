```java
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avgs = new int[n];
        if (k == 0) {
            return nums;
        }
        if (2 * k + 1 > n) {
            for (int i = 0; i < n; i++) {
                avgs[i] = -1;
            }
            return avgs;
        }
        long sum = 0;
        for (int i = 0; i < 2 * k + 1; i++) {
            sum += nums[i];
        }
        for (int i = k; i < n - k; i++) {
            avgs[i] = (int) (sum / (2 * k + 1));

            if (i + k + 1 < n) {
                sum += nums[i + k + 1];  
                sum -= nums[i - k];      
            }
        }
        for (int i = 0; i < k; i++) {
            avgs[i] = -1;
        }
        for (int i = n - k; i < n; i++) {
            avgs[i] = -1;
        }
        return avgs;
    }
}

```