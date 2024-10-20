public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left=0;
        int length=height.length;
        int right=length-1;
        int maxArea=0;
        while(left<right){
            int currentarea=Math.min(height[left],height[right])*(right-left);
            maxArea=Math.max(maxArea,currentarea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}
