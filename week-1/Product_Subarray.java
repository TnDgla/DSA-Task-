import java.util.*;
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(n==1)    return nums[0];
        int mx = Integer.MIN_VALUE;
        int prod = 1;
        for(int i=0;i<n;i++){
            prod*=nums[i];
            mx=Math.max(prod,mx);
            if(prod==0) prod=1;
        }
        prod = 1;
        for(int i=n-1;i>=0;i--){
          prod*=nums[i];
          mx=Math.max(prod,mx);
          if(prod==0)
           prod=1;
        }
        return mx;
    }
}