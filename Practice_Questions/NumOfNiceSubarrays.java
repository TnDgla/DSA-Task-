public class NumOfNiceSubarrays {
    public static int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    private static int atMostK(int[] nums, int k) {
        int left = 0, count = 0, oddCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 == 1) {
                oddCount++;
            }

            while (oddCount > k) {
                if (nums[left] % 2 == 1) {
                    oddCount--;
                }
                left++; 
            }

            count += right - left + 1;
        }

        return count;
    }
        public static void main(String[] args) {
            int[] nums1 = {1, 1, 2, 1, 1};
            int k1 = 3;
            System.out.println("Number of nice subarrays: " + numberOfSubarrays(nums1, k1)); 
    
            int[] nums2 = {2, 4, 6};
            int k2 = 1;
            System.out.println("Number of nice subarrays: " + numberOfSubarrays(nums2, k2)); 
    
            int[] nums3 = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
            int k3 = 2;
            System.out.println("Number of nice subarrays: " + numberOfSubarrays(nums3, k3)); 
        
    }
}
