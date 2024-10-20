import java.util.HashMap;

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0, sum = 0, maxSum = 0;

        while (right < nums.length) {
            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.get(nums[right]) > 1) {
                sum -= nums[left];
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }

            maxSum = Math.max(maxSum, sum);
            right++;
        }

        return maxSum;
    }
}