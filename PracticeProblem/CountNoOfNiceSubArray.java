class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return subarraySumLessThenOrEqaulToK(nums,k)-subarraySumLessThenOrEqaulToK(nums,k-1);
    }
    public int subarraySumLessThenOrEqaulToK(int[] nums,int k){
        int ans = 0;
        int sum=0;
        int j = 0;
        for(int i=0;i<nums.length;i++){
           sum+=nums[i]%2;
           while(sum>k&&j<nums.length){
               sum-=nums[j]%2;
               j++;
           }
            ans+=i-j+1;
        }
        return ans;
    }
}