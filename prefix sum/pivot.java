package prefix sum;
// 724. Find Pivot Index
// 
class Solution {
    public int pivotIndex(int[] nums) {
     int tsum =0;
     int lsum=0;
     for(int ele : nums){
        tsum+=ele;
     }   
     for(int i = 0 ; i<nums.length ; lsum+=nums[i++]){
        if(lsum*2==tsum-nums[i]){
            return i;
        }
     }
     return -1;
    }
}
