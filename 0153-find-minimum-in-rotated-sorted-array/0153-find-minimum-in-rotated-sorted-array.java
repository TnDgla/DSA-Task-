class Solution {
    public int findMin(int[] nums) {
        int min =Integer.MAX_VALUE;

        for(int i=0; i<nums.length;i++){

            if(min>nums[i]){
                min=nums[i];

            }

        }
        return min;
        
    }
}