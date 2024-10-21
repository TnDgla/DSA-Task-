class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        // Arrays.sort(nums);
        // if(nums[n-1]!=n){
        //     return n;
        // }
        // for(int i=0;i<n-1;i++){
        //     if(nums[i+1]!=(nums[i]+1)){
        //         return nums[i]+1;
        //     }
        // }

        // return 0;
        int exceptedsum=((n*(n+1))/2);
        int actualsum=0;
        for(int i=0;i<n;i++){
            actualsum+=nums[i];
        }
        return exceptedsum-actualsum;
    }
}