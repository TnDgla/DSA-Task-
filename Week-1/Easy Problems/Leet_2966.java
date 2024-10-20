import java.util.Arrays;

public class Leet_2966 {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][]ans=new int[nums.length/3][3];

        int x=0;
        
        for(int i=0;i<nums.length;i+=3){
            if(nums[i+1]-nums[i]<=k && nums[i+2]-nums[i+1]<=k && nums[i+2]-
            nums[i]<=k){
            for(int j=0;j<3;j++){
                ans[x][j]=nums[i+j];
                
            }
            x++;
        }
        else return new int[0][0];
    }

    return ans;
}
}
