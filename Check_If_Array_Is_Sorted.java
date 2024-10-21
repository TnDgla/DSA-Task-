package Array_Problems;

public class Check_If_Array_Is_Sorted {
    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};
        System.out.println(check(nums));
        
    }
    public static boolean check(int[] nums) {
        int cnt=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                cnt++;
            }
        }
        if(nums[0]<nums[nums.length-1]){
            cnt++;
        }
        return cnt<=1;
    }
}