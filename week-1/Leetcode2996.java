import java.util.*;
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        if (n % 3 != 0) return new int[0][0];
        for (int i = 2; i < n; i += 3) {
            if (nums[i] - nums[i - 2] <= k) {
                ans.add(Arrays.asList(nums[i - 2], nums[i - 1], nums[i]));
            } else {
                return new int[0][0];
            }
        }
        int[][] result = new int[ans.size()][3];
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = ans.get(i).get(j);
            }
        }
        return result;
    }
}