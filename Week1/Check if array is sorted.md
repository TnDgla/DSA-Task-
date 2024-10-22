```java
class Solution {
    public boolean check(int[] nums) {
        int x=0;
        int n=nums.length;
        if(nums[0]<nums[n-1]) x++;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]) x++;
            if(x>1) return false; 
        }
        return true;
    }
}
```