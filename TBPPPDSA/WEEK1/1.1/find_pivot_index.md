```java

class Solution {
    public int pivotIndex(int[] nums) {
        int ans = 0;
        int left = 0;

        for(int i:nums){
            ans += i;
        }
        for(int i=0; i<nums.length; i++){
            if(left == ans - left - nums[i]){
                return i;
            }else{
                left += nums[i];
            }
        }
        return -1;
    }
}
```