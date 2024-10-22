import java.util.*;
public class Move_Zeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
