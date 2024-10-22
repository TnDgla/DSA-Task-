public class majority_element {
    public int majorityElement(int[] nums) {
        int res = 0, c = 0;
        for (int i : nums) {
            if (c == 0) {
                res = i;
            }
            if (res == i) {
                c++;
            } else {
                c--;
            }
        }
        return res;
    }
}