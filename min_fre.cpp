class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        unordered_map<int,int>mp;
        for(auto i:nums)
        {
            mp[i]++;
        }
        int maxi=1;
        int c=0;
        for(auto i=mp.begin();i!=mp.end();i++)
        {
            if(i->second>maxi)
            {
                maxi=i->second;
                c=maxi;
            }
            else if(i->second==maxi)
            {
                c+=i->second;
            }
        }
        
        return c;
    }
};