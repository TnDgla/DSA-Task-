
import java.util.*;

public class DivideArray {

        public static int[][] divideArray(int[] nums, int k) {
            int n = nums.length;
            int m = n/3; // no. of groups
            Arrays.sort(nums);
            int counter = 0;
            int[][] ans = new int[m][3];
            for(int i=0;i<m;i++) {
                int min = nums[counter];
                for(int j=0;j<3;j++) {
                    if(nums[counter] - min > k) {
                        // violated the condition
                        return new int[][] {};
                    }
                    ans[i][j] = nums[counter++];
                }
            }
            return ans;
        }
    

    public static void main(String[] args) {
       
        int[] nums1 = {1, 3, 4, 8, 7, 9, 3, 5, 1};
        int k1 = 2;
        System.out.println(divideArray(nums1, k1)); 
        
        int[] nums2 = {2, 4, 2, 2, 5, 2};
        int k2 = 2;
        System.out.println(divideArray(nums2, k2)); 
        
        int[] nums3 = {4, 2, 9, 8, 2, 12, 7, 12, 10, 5, 8, 5, 5, 7, 9, 2, 5, 11};
        int k3 = 14;
        System.out.println(divideArray(nums3, k3)); 
    }
}
