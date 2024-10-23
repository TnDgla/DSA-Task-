import java.util.Arrays;

public class DivideArraysIntoArraysWithMaxDifference {
    public static void main(String[] args) {
        int nums[] = {1,3,4,8,7,9,3,5,1}; 
        int k = 2;
        int[][] ans=divideArray(nums,k);
        System.out.print("[");
        for(int i=0;i<ans.length;i++){
            System.out.print("[");
            for(int j=0;j<3;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }
    
    public static int[][] divideArray(int[] nums, int k) {
        int[][] ans=new int[nums.length/3][3];
        Arrays.sort(nums);
        int idx=0;
        for(int i=0;i<nums.length-2;i+=3){
            if(nums[i+2]-nums[i]>k){
                return new int[0][0];
            }
            ans[idx++]=new int[]{nums[i],nums[i+1],nums[i+2]};
        }
        return ans;
    }
}
