class Solution {
    public static int count(int[] nums, int ele){
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele)
            c++;
        }
        return c;
    }
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int i=0;
        for(i=0;i<nums.length;i++){
            if (count(nums,nums[i])>(n/2)){
                break;
            }
        }
        return nums[i];
    }
}
