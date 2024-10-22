public class max_consecutive_ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0, c = 0;
        for (int i : nums) {
            if (i == 1) {
                c++;
                res = Math.max(res, c);
            } else {
                c = 0;
            }
        }
        return res;
    }
}
