import java.util.HashMap;

public class ContiguousSubarraySum {
    public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1);  
        int runningSum = 0;

        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];

            int remainder = runningSum % k;

            if (remainder < 0) remainder += k;

            if (remainderMap.containsKey(remainder)) {
                if (i - remainderMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                remainderMap.put(remainder, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {23, 2, 4, 6, 7};
        int k1 = 6;
        System.out.println(checkSubarraySum(nums1, k1)); 

        int[] nums2 = {23, 2, 6, 4, 7};
        int k2 = 6;
        System.out.println(checkSubarraySum(nums2, k2)); 

        int[] nums3 = {23, 2, 6, 4, 7};
        int k3 = 13;
        System.out.println(checkSubarraySum(nums3, k3)); 
    }
}
