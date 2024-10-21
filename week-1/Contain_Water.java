import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int cArea = Math.min(height[left],height[right])*(right-left);
            maxArea = Math.max(maxArea, cArea);
            if (height[left] < height[right])   left++;    
            else    right--;    
        }

        return maxArea;
    }
}