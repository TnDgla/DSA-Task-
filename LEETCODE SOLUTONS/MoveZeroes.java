class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            c++;
        }
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            nums[k++]=nums[i];
        }
        int j=nums.length-1;
        while(c>0)
        {
            nums[j--]=0;
            c--;
        }
    }
}