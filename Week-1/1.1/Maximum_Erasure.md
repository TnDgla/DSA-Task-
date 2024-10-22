```java
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int maxScore = 0, currentSum = 0, left = 0;

        for (int right = 0; right < nums.length; right++) {
            while (seen.contains(nums[right])) {
                seen.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
            seen.add(nums[right]);
            currentSum += nums[right];
            maxScore = Math.max(maxScore, currentSum);
        }

        return maxScore;
    }
}

```