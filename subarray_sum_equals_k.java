import java.util.HashMap;
import java.util.Map;

public class subarray_sum_equals_k {
        public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumCount = new HashMap<>();
        sumCount.put(0, 1); 
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            if (sumCount.containsKey(sum - k)) {
                count += sumCount.get(sum - k);
            }
            sumCount.put(sum, sumCount.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
