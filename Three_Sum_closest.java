import java.util.Arrays;

public class Three_Sum_closest {
    public static void main(String[] args) {
        int[] nums={-1,2,1,-4};
        System.out.println(threeSumClosest(nums, 1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int closestSum = 100000;      
        for(int i = 0; i<n-2; i++) {
            int l = i+1, r = n-1;
            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(Math.abs(target-sum) < Math.abs(target-closestSum)) {
                    closestSum = sum;
                }
                if(sum > target)
                    r--;
                else
                    l++;
            }
        }
        return closestSum;
    }
}
