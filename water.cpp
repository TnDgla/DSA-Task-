class Solution {
public:
    int maxArea(vector<int>& height) {
        int area =0;
        int maxi=0;
        int right = height.size()-1;
        int left = 0;
        while(left<right){
            int b = right-left;
            int h = min(height[left],height[right]);
            area = b*h;
            maxi=max(area,maxi);
            if(height[left]<height[right]){left++;}
            else{
                right--;
            }
    }
    return maxi;
    }
};