class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int rigth = height.length - 1;
        int res = 0;
        while (left < rigth) {
            res = Math.max(res, (rigth - left) * Math.min(height[left], height[rigth]));
            if (height[left] < height[rigth]) {
                left++;
            } else {
                rigth--;
            }

        }
        return res;

    }
}