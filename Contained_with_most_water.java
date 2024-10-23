class Solution {
    public int maxArea(int[] height) {
    int st = 0;
    int en =height.length-1;
    int water = Integer.MIN_VALUE;
    while(st<en){
        int h=Math.min(height[st],height[en]);
        int b = en-st;
        int area =h*b;
        water =Math.max(water,area);
        if (height[st]<height[en]) st++;
        else en--;
    }
    return water;   
    }
}