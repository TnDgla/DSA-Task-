```java
class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        int maxFrequency = 0;
        int totalCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int count = 1;  // Start count at 1 for the current element

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == current) {
                    count++;
                }
            }

            if (count > maxFrequency) {
                maxFrequency = count;
                totalCount = count;
            } else if (count == maxFrequency) {
                totalCount += count;
            }
        }

        return totalCount;
    }
}
```