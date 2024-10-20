import java.util.*;
public class Rotate_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int n=nums.length;
        k= k%n;
        reverse(nums, 0 , n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int[] nums, int i, int j){
        while(i<j){
            int t= nums[i];
            nums[i]= nums[j];
            nums[j]= t;
            i++;
            j--;
        }
    }
}
