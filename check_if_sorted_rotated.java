public class check_if_sorted_rotated {
    public boolean check(int[] nums) {
        int c = 0; 
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                if(c == 1) {
                    return false;
                }
                c++;
            }
        }
        if(c == 1) {
            return nums[0] >= nums[nums.length - 1];
        }
        return true;
    }
}
