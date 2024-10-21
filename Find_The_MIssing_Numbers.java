package Array_Problems;

public class Find_The_MIssing_Numbers {
    public static void main(String[] args) {
        int[] nums={3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int x=0;
        int j=1;
        for(int i=0;i<nums.length;i++){
            x^=nums[i]; 
            x^=j;
            j++;
        }
        return x;
    }
    
}
