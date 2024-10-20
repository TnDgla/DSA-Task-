import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int ans=Integer.MAX_VALUE/2;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int total=nums[i]+nums[j]+nums[k];
                if(Math.abs(total-target)<Math.abs(ans-target)){
                    ans=total;
                }
                if(total<target){
                    j++;
                }
                else if(total>target){
                    k--;
                }
                else{
                    return total;
                }

            }
        }
        return ans;
    }
}
