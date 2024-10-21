class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=0;
        while(i<j)
        {
            int maxheight=Math.min(height[i],height[j]);
            int width=j-i;
            int ar=maxheight*width;
            max=Math.max(max,ar);
            while(i<j && height[i]<=maxheight)
            {
                i++;
            }
            while(i<j && height[j]<=maxheight)
            {
                j--;
            }
        }
        return max;    
    }
}