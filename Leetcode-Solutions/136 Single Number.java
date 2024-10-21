import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int num=0;
        int i=0;
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            i++;
            else
            num=nums[i];
        }
        if(num==0 && i==nums.length-1)
        return nums[nums.length-1];
        else
        return num;
    }
}
