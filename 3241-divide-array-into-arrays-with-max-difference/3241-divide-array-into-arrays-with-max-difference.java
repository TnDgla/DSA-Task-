class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int l = nums.length;
        if (l % 3 != 0) {
            return new int[0][0];
        }

        Arrays.sort(nums);
        int[][] result = new int[l / 3][3];
        int c = 0;

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (c < l - 1 && (c + 3) % 3 == 0 && nums[c + 2] - nums[c] > k) {
                    return new int[0][0];
                }
                result[i][j] = nums[c++];
            }
        }
        return result;
    }
}