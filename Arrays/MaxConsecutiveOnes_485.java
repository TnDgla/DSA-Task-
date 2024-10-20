package Arrays;

public class MaxConsecutiveOnes_485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                max = Math.max(count, max);
                count = 0;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 1, 1, 0, 0, 1, 1, 0, 0 };
        System.out.println(findMaxConsecutiveOnes(nums));

    }
}
