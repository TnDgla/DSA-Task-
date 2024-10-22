import java.util.*;
public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] a=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                }
            }
        }
        System.out.print(Arrays.toString(a));
    }
}