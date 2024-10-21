class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] %= 2;
        }
        
        int []prefix = new int [nums.length + 1];
        prefix[0] = 1;
        int sum = 0 ;
        int ans = 0;
        
        for(int num : nums){
            sum = sum + num;
            if(sum >= k){
                 ans = ans + prefix[sum - k];
            }
            prefix[sum]++;
        }
        return ans;
    }
}
