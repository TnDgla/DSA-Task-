class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
         int n = nums.length;
        int[] cnt = new int[n + 1]; // HashMap to store prefix sums
        cnt[0] = 1; // Base case: prefix sum of 0 occurs once
        int ans = 0, t = 0; // ans: result, t: current prefix sum (count of odd numbers)
        
        for (int v : nums) {
            t += v & 1; // Increment prefix sum if the number is odd
            if (t - k >= 0) {
                ans += cnt[t - k]; // If (t - k) exists in cnt, add its count to ans
            }
            cnt[t]++; // Increment the count of current prefix sum in cnt
        }
        
        return ans;
    }
}