class Solution {
    public int maxProduct(int[] nums) {
        int prefix=0;
        int suffix=0;
        int ans=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=nums[i];
            else prefix*=nums[i];
            if(suffix==0) suffix=nums[n-1-i];
            else suffix*=nums[n-i-1];
            
            ans=Math.max(ans,Math.max(prefix,suffix));
        }
        return ans;
    }
}