public class MinCOmmonValue {
        public int getCommon(int[] nums1, int[] nums2) {
            int i = 0, j = 0;
    
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    return nums1[i]; 
                } else if (nums1[i] < nums2[j]) {
                    i++; 
                } else {
                    j++; 
                }
            }
    
            return -1; 
        }
    
        public static void main(String[] args) {
            MinCOmmonValue solution = new MinCOmmonValue();
    
            // Test case 1
            int[] nums1 = {1, 2, 3};
            int[] nums2 = {2, 4};
            System.out.println(solution.getCommon(nums1, nums2)); 
    
            // Test case 2
            int[] nums1_2 = {1, 2, 3, 6};
            int[] nums2_2 = {2, 3, 4, 5};
            System.out.println(solution.getCommon(nums1_2, nums2_2)); 
        }
    
}
