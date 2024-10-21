class Solution {
    public boolean check(int[] nums) {
        int k=pivot(nums);
        if(k==-1) return true;

        for(int i=0;i<nums.length-1;i++){
            int curr=nums[(k+i)%nums.length];
            int next=nums[(k+i+1)%nums.length];

            if(curr>next){
                return false;
            }
        }
        return true;
        
    }
    public int pivot(int [] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return i+1;

            }
        }
        return -1;
    }
}