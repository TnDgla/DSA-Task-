public class k_radius_subarray_averages {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        long sum = 0; 
        int size = 2 * k + 1; 
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            sum += nums[i];  
            if (i >= size - 1) {

                ans[i - k] = (int) (sum / size);
                sum -= nums[i - size + 1];
            }
        }
        return ans;
    }
}
