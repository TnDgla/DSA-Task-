import java.util.Arrays;

public class divideArraysIntoArrays {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][]res = new int[nums.length/3][3];
        int idx =0;
        for(int i=0;i<nums.length;i+=3){
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];
            if(c-a <= k){
                res[idx][0]=a;
                res[idx][1]=b;
                res[idx][2]=c;
                idx++;
            }else{
                return new int[0][0];
            }
            
            }
             return res;
            
        }
 }

