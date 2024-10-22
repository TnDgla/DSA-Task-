class Solution {
    public int[][] divideArray(int[] nums, int k) {
             int len = nums.length;
     int[][] result = new int[len/3][3];
     Arrays.sort(nums);
     for(int i=0,m=0; i<len; i=i+3,m++){
         result[m][0] = nums[i];
         for(int j=1; j<3; j++){
             if(nums[i+j]-result[m][0]<=k){
                 result[m][j]=nums[i+j];
             } else{
                 return new int[0][0];
             }
         }
     }
     return result;
 }
}
