```java
class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
         for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int left = 0;  
        for (int i = 0; i < nums.length; i++) {
            int right = total - left - nums[i];  
            if (left == right) { 
                return i; 
            }
            left = left + nums[i]; 
        }

        return -1;  
    }
}
```