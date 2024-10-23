class Solution {
    public int majorityElement(int[] nums) {
        int new_array=nums[0];
        int temp=0;
        for(int i=0;i<nums.length;i++){
           if(temp==0){
            new_array=nums[i];
            temp=1;
        }
           else if(nums[i]==new_array)
            temp++;
           else
            temp--;
           
        }
        return new_array;
    }
}