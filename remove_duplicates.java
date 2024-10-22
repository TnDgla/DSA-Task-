class Solution {
    public int removeDuplicates(int[] nums) {
        int arr =0;
        for(int i:nums)
        {
            if(arr ==0 || i != nums[arr-1]){
            nums[arr++] = i;
            }

        }
        return arr;
        
    }
}