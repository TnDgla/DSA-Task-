class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums); 
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 3) {
            if (nums[i + 2] - nums[i] <= k) {
                result.add(new int[]{nums[i], nums[i + 1], nums[i + 2]});
            } else {
                return new int[0][0]; 
            }
        }

        return result.toArray(new int[result.size()][3]); 
    }
}