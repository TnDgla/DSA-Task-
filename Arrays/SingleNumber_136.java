package Arrays;

public class SingleNumber_136 {
    public static int singleNumber(int[] nums) {
        int value = 0;
        for (int num : nums) {
            value = value ^ num;
        }
        return value;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1 };
        System.out.println(singleNumber(nums));
    }
}
