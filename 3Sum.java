import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> mainList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (i != 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0) {
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else  {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[left]);
                    subList.add(nums[right]);
                    mainList.add(subList);
                    left++;
                    while ( nums[left] == nums[left - 1] && left < right)
                        left++;
                }
            }
        }
        return mainList;
    }
}