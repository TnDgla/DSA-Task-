import java.util.*;
public class Sort_Colors {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        for(int element:nums){
            System.out.println(element);
        }
    }
}
