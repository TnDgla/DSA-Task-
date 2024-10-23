class Solution {
    public void moveZeroes(int[] nums) {
    int temp=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[temp]=nums[i];
            temp++;
        }
    }
    for(int i=temp;i<nums.length;i++){
        nums[i]=0;
    }
  }   
}