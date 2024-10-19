class Solution {
    public int[] getAverages(int[] nums, int k) {
        if(k < 1) return nums;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) result[i] = -1;
        if (nums.length < (2 * k + 1)) return result;  // If the array is too short, return result
        
        int left = 0;
        int right = 0;
        long prefixSum = 0;
        while (right < nums.length) {
            prefixSum += nums[right];
            if (right - left + 1 == 2 * k + 1) {
                result[left + k] = (int)(prefixSum / (2 * k + 1));
                prefixSum -= nums[left];
                left++;
            }
            right++;
        }
        return result;
    }
}