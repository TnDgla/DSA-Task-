class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int result[] = new int[nums.length];

        int evenIndex = 0;
        int oddIndex = nums.length - 1;

        for (int n : nums) {
            if (n % 2 == 0) {
                result[evenIndex] = n;
                evenIndex++;
            } else {
                result[oddIndex] = n;
                oddIndex--;
            }
        }

        return result;
    }
}