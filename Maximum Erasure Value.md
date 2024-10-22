```java
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       Set<Integer> set=new HashSet<>();
       int left=0;
       int sum=0;
       int maxsum=Integer.MIN_VALUE;
       for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum-=nums[left++];
            }
            set.add(nums[right]);
            sum+=nums[right];
            maxsum=Math.max(sum,maxsum);
       }
       return maxsum;
    }
}
```