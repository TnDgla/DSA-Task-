```java
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int c=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(sum-target)<Math.abs(target-c)){
                    c=sum;
                }else if(sum>target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return c;
    }
}
```
