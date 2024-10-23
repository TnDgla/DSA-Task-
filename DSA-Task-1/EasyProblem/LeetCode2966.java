class Solution {
    public int[][] divideArray(int[] nums, int l) {
        Arrays.sort(nums);
        int arr[][]=new int[nums.length/3][3];
        int k=0;
        for(int i=0;i<nums.length-2;i+=3){
            if(nums[i+2]-nums[i]<=l){
                arr[k][0]=nums[i];
                arr[k][1]=nums[i+1];
                arr[k][2]=nums[i+2];
                k++;
            }
            else{
                return new int[0][];
            }
        }
        return arr;
    }
}