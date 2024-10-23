class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int maximum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int p=1;
            for(int j = i ; j < nums.length ;j++){
                p=p*nums[j];

                if(p>maximum){
                    maximum=p;
                }
            }
        }
        return maximum;}
}