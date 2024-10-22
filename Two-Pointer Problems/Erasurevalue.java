package Two-Pointer Problems;
// 1695. Maximum Erasure Value

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int maxSum = 0;
        int currentSum = 0;

        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }

            set.add(nums[right]);
            currentSum += nums[right];

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
