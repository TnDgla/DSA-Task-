```java
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int r = (k != 0) ? sum % k : sum;

          
            if (r < 0) r += k;

            if (mp.containsKey(r)) {
                if (i - mp.get(r) > 1) return true;
            } else {
                mp.put(r, i);
            }
        }
        return false;
    }
}

```