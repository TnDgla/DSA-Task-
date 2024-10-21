public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i =0;
        int j = height.length-1;
        int maxAreaRequired = 0;
        while(i<j){
            int smallHeight = Math.min(height[i], height[j]);
            maxAreaRequired = Math.max(maxAreaRequired, (j-i)*smallHeight);
            if(height[i]<height[j]){
                i++;
            } else{
                j--;
            }
        }
        return maxAreaRequired;
    }
}
