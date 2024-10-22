class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int ans1=0;
        int ans2=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans1=i;
                    ans2=j;
                    break;
                }
            }
            if(ans1!=0 && ans2!=0)
            break;
        }
        arr[0]=ans1;
        arr[1]=ans2;
        return arr;
    }
}