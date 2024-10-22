package prefix sum;
// 523. Continuous Subarray Sum
// https://leetcode.com/problems/continuous-subarray-sum/
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, -1); // handle the case where the subarray starts from index 0
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int mod = k == 0 ? sum : sum % k; // to handle the case when k is 0

            if (sumMap.containsKey(mod)) {
                if (i - sumMap.get(mod) > 1) { // ensure the length of subarray is at least 2
                    return true;
                }
            } else {
                sumMap.put(mod, i);
            }
        }
        
        return false;
    }
}
