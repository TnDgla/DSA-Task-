import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length==1)  return nums[0];
        Arrays.sort(nums);
        int Csum  = nums[0] + nums[1] + nums[2];
        int n = nums.length;
        for(int i=0;i<n;i++){
            int start = i+1;
            int end = n-1;
            while(start< end){
                int sum = nums[i]+nums[start]+nums[end];
                if(Math.abs(target-sum)<Math.abs(target-Csum)){
                    Csum = sum;
                }
                if(sum<target){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return Csum;
    }
}