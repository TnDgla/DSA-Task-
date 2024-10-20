class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int r = nums[0] + nums[1] + nums[2], gap = Integer.MAX_VALUE;
        for(int l = 0; l < nums.length - 2; l++){
            int m = l + 1, right = nums.length - 1;
            while(m < right){
                int sum = nums[l] + nums[m] + nums[right];
                if(sum == target){
                    return target;
                }
                int currGap = Math.abs(sum - target);
                if( currGap < gap){
                    gap = currGap;
                    r = sum;
                }
                if(sum < target){
                    m++;
                } else {
                    right--;
                }
            }
        }
        return r;
    }
}