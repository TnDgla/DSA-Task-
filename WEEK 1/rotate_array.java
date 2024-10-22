public class rotate_array {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int res[] = new int[len];
        for (int i = 0; i < len; i++) {
            res[(i + k) % len] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = res[i];
        }
    }
}