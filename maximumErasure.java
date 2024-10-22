import java.util.*;
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int mx = 0;
        int len = 0;
        int i=0,j=0;
        while(j<nums.length){
            while(st.contains(nums[j])){
                st.remove(nums[i]);
                len-=nums[i++];
            }
            st.add(nums[j]);
            len+=nums[j];
            mx = Math.max(len,mx);
            j++;
        }
        return mx;
    }
}