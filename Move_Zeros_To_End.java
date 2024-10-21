package Array_Problems;

public class Move_Zeros_To_End {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        move(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
    public static void move(int[] nums){
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
    }
}
