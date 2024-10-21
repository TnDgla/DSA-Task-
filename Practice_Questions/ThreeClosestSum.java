import java.util.Arrays;

public class ThreeClosestSum {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2]; 

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++; 
                } else if (currentSum > target) {
                    right--; 
                } else {
                    return currentSum;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println("Closest sum to target: " + threeSumClosest(nums1, target1)); 
        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        System.out.println("Closest sum to target: " + threeSumClosest(nums2, target2)); 
    }
}
