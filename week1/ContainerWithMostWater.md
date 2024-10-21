class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxWater = 0;
        
        while (start < end) {
            int min = Math.min(height[start], height[end]);
            int width = end - start;
            int water = min * width;
            
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
            
            maxWater = Math.max(maxWater, water);
        }
        
        return maxWater;
    }
}
