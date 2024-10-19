import java.util.Arrays;

class Solution {
    public static boolean isSorted(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isRotated(int[] nums){
        int n=nums.length;
        int min=nums[0];
        int idx=0;
        for(int i=0;i<n;i++){
            if(nums[i]<min)
            {
                min=nums[i];
                idx=i;
            }
        }
        if(idx==0 && nums[n-1]==nums[0]){
            int i=0;
            for(i=n-1;i>=0;i--){
                if(nums[i]!=nums[0])
                break;
            }
            idx=i+1;
        }
        System.out.println(idx);
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(arr[(i+idx)%n]!=nums[i])
            {
                return false;
            }
        }
        return true;
    }
    public boolean check(int[] nums) {
        if(isSorted(nums) || isRotated(nums)){
            return true;
        }
        else{
            return false;
        }
    }
}
