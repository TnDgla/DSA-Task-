package Array_Problems;

public class Maximum_Consecutive_Ones {
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1};
        System.out.println(find(nums));
    }
    public static int find(int[] nums){
        int ans=0;
        int ones=0;
        for(int num:nums){
            if(num==1){
                ones++;
                ans=Math.max(ans,ones);
            }else{
                ones=0;
            }
        }
        return ans;
    }
    
}
