import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k)  ans++;
            if(mp.containsKey(sum-k)){
                ans+=mp.get(sum-k);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
