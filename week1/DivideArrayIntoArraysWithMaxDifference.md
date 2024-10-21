class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int arr[][] = new int[nums.length / 3][3];
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i = i + 3) {
            int first = nums[i];
            int second = nums[i + 1];
            int third = nums[i + 2];
            if (third - first <= k) {
                arr[count][0] = first;
                arr[count][1] = second;
                arr[count][2] = third;
                count++;
            } else {
                return new int[0][0];
            }
        }
        return arr;
    }
}
