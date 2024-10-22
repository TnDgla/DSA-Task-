import java.util.*;
class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n];
        pre[0] = nums[0]; 
        for(int i =1;i<n;i++){
            pre[i] = pre[i-1] + nums[i];
        }
        for(int i = n-2;i>=0;i--){
            nums[i] +=nums[i+1];
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pre[i]) return i;
        }
        return -1;
    }
}