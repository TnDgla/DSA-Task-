class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
         int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            int remainder = prefixSum % k;
            if (remainder < 0) remainder += k;
            if (map.containsKey(remainder)) {
                if (i - map.get(remainder) > 1) return true;
            } else {
                map.put(remainder, i);
            }
        }
        return false;
    }
}