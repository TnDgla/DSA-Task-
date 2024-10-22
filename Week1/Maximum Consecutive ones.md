```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount=0;
        int count=0;
        for(int i:nums){
            if(i==1) count++;
            else{
                maxcount=Math.max(maxcount,count);
                count=0;
            }
        }
        maxcount=Math.max(maxcount,count);
        return maxcount;
    }
}
```