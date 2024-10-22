```java
class Solution {
    public int maxArea(int[] height) {
        int st=0;
        int ed=height.length-1;
        int area=0;
        while(st<ed){
            int h=Math.min(height[st],height[ed]);
            int width=ed-st;
            int aa=h*width;
            if(area<aa){
                area=aa;
            }
            if(height[st]<height[ed]){
                st++;
            }else{
                ed--;
            }
        }
        return area;
    }
}
```