
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int ones=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ones++;
            }
            else{
                ones=0;
            }
            ans=Math.max(ans,ones);
        }
        return ans;
    }
}
