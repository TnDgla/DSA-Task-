```java
class Solution {
    public void moveZeroes(int[] nums) {
        int pos=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[pos++]=nums[i];
            }
        }
        for(int i=pos;i<n;i++) nums[i]=0;
    }
}
```