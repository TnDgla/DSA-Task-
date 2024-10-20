class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int sum = n;
        int max = 0;

        int[] sums = new int[n * 2 + 1];
        for (int i = 0; i < sums.length; i++) {
            sums[i] = -2;
        }
        sums[sum] = -1;

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] * 2 - 1); 
            if (sums[sum] == -2) {
                sums[sum] = i;
            } else {
                max = Math.max(max, i - sums[sum]);
            }
        }
        return max;
    }
}
