class Solution {
public:
    int subarraySum(vector<int>& arr, int k) {
        vector<int>pre(arr.size(),0);
        pre[0] = arr[0];
        for(int i=1; i<arr.size(); i++){
            pre[i] = arr[i] + pre[i-1];
        }
        unordered_map<int,int> mp;
        int count = 0;
        for(int i=0; i<arr.size(); i++){
            if(pre[i] == k) count++;
             
            int diff = pre[i] - k;
            if(mp.find(diff) != mp.end()) count += mp[diff];
            mp[pre[i]]++;
            
        }
        return count;
    }
};