import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class move_zeroes {
    public void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                list.add(nums[i]);
                nums[i] = 0;
            }
        }
        Arrays.fill(nums, 0);
        int i = 0;
        for(int e: list) {
            nums[i++] = e;
        }
    }
}
