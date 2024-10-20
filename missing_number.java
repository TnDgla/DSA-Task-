public class missing_number {
    public int missingNumber(int[] nums) {
        int n = nums.length, sum = (n * n + n) / 2;
        for(int i: nums) {
            sum -= i;
        }
        return sum;
    }
}
