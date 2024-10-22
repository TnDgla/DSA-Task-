import java.util.*;
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        int count = 0;
        int mx = 1;
        for (int i=0;i<n;i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        for(int f:mp.values()){
            if(f>mx){
                mx=f;
                count = mx;
            }
            else if(f==mx){
                count+=mx;
            }
        }
        return count;
    }
}