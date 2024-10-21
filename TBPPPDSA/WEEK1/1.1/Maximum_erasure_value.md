```java
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int[] count = new int[10001]; 
        int left = 0;
        int right = 0; 
        int maxScore = 0;
        int currentScore = 0;

        while (right < nums.length) {
            count[nums[right]]++;
            currentScore += nums[right];
            while (count[nums[right]] > 1) {
                count[nums[left]]--;
                currentScore -= nums[left];
                left++;
            }
            maxScore = Math.max(maxScore, currentScore);
            right++;
        }
        return maxScore;
    }

    }
    ```
    