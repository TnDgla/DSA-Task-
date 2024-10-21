class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int j=1;
        for(int i=0;i<nums.length;i++){
            if(j==nums[i]){
                j++;
            }
        }
        return j;
    }
}