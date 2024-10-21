class Solution {
    public void sortColors(int[] nums) {
        for(int j=1;j<nums.length;j++)
        {
            int key=nums[j];
            int i=j-1;
            while(i>=0 && nums[i]>key)
            {
                nums[i+1]=nums[i];
                i=i-1;
                nums[i+1]=key;
            }
        }
    }
}
