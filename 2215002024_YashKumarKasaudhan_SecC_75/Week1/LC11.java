class Solution {
    public int maxArea(int[] height) {

        int maximum = Integer.MIN_VALUE;
        //Define the left and right pointers
        int left = 0;
        int right = height.length-1;
        while(left < right){
            //Define the shorter pole 
            int shorter = Math.min(height[right], height[left]);
            //Update the ans 
            maximum = Math.max(maximum, shorter * (right-left));
             while (left < right && height[left] <= shorter) {
                left++;
            }

            while (left < right && height[right] <= shorter) {
                right--;
            }
        }

        return maximum;
    }
}