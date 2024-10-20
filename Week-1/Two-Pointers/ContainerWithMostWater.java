
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;

        int area=Integer.MIN_VALUE;

        while(i<j){
            int ht=Math.min(height[i],height[j]);
            int bd=j-i;
            int curr_Area=ht*bd;

            area=Math.max(area,curr_Area);

            if(height[i]>=height[j]){
                j--;
            }
            else i++;
        }

        return area;
    }
}
