import java.util.*;
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int arr[] = new int[n];
        Arrays.fill(arr,-1);
        if (2 * k + 1 > n)
            return arr;
        long sum = 0;
        int m = 0;
        while (m < 2 * k && m < n) {
            sum += nums[m++];
        }
        for (int i = k; i < n && n - i - 1 >= k; i++) {
            sum += nums[i + k];
            arr[i] = (int)(sum / (2 * k + 1));
            sum -= nums[i - k];
        }
        return arr;
    }
}
