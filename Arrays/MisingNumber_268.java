package Arrays;

public class MisingNumber_268 {
    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = 0;
        while (len > 0) {
            sum += len;
            len--;
        }
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = { 0, 1, 3 };
        System.out.println(missingNumber(nums));
    }
    
}
