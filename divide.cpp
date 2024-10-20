class Solution {
public:
    vector<vector<int>> divideArray(vector<int>& nums, int k) {
        vector<vector<int>> ans;
        sort(nums.begin(),nums.end());
        int i=0;
        
        while(i<nums.size()){
            if(nums[i+2]-nums[i]<=k&&i<nums.size()-2){
                ans.push_back({nums[i],nums[i+1],nums[i+2]});
                i+=3;
            }
            else{
                return {};
            }
        }

        return ans;
    }
};