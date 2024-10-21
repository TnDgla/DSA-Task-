package Array_Problems;

public class Single_Number {
    public static void main(String[] args) {
        int[] nums={2,2,1};
        System.out.print(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            x^=nums[i];
        }
        return x;
    }
    
}
