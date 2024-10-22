import java.util.*;
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        int prefixSum = 0;
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += (nums[i] == 1) ? 1 : -1;
            if (mp.containsKey(prefixSum)) {
                len = Math.max(len, i - mp.get(prefixSum));
            } else {
                mp.put(prefixSum, i);
            }
        }

        return len;
    }
}