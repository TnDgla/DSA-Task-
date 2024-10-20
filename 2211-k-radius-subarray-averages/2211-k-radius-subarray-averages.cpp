class Solution {
public:
    vector<int> getAverages(vector<int>& nums, int k) {
         int n = nums.size(),i;
        long long int s=0;
        vector<int> ans(n,-1);
        for(i=0;i<n;i++){
            if(i<2*k){
                s+= nums[i];
            }else{
                s+=nums[i];
                ans[i-k] = s/(2*k+1);
                s -= nums[i-(2*k)];
            }
        }
        return ans;
    }
};