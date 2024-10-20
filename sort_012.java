public class sort_012 {
    private static void swap(int a[], int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;

    }
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1, mid = 0;
        while(mid <= right) {
            if(nums[mid] == 0) {
                swap(nums, left, mid);
                left++;
                mid++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums, mid, right);
                right--;
            }
        }
    }
}
