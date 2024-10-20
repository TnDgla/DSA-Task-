class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] start=new int[n];
        int[] end=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            start[i]=sum;
        }
        sum=0;
        for(int i=n-1;i>=0;i--){
            sum+=nums[i];
            end[i]=sum;
        }
        for(int i=0;i<n;i++){
            if(start[i]==end[i]){
                return i;
            }
        }
        return -1;
        
    }
}