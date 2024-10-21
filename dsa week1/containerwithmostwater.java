// public class containerwithmostwater {
    
// }
import java.io.*;
class Solution {
    public int maxArea(int[] height) {
        int area= Integer.MIN_VALUE;
        int l=0;
        int r=height.length-1;
        while(l<r){
            area=Math.max(area,Math.min(height[l],height[r])*(r-l));   //height,breadth(r-l)  
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return area;
    }
}
















