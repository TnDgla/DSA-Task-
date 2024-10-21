public class single_number {
    public int singleNumber(int[] nums) {
        int k = 0;
        for (int i : nums) {
            k ^= i;
        }
        return k;
    }
}