class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int total = 0;
        int c= 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int p = map.get(nums[i]);
                while (j <= p) {
                    c -= nums[j];
                    j++;
                }
            }
            map.put(nums[i], i);
            c += nums[i];
            total = Math.max(total, c);
        }
        return total;
    }
}