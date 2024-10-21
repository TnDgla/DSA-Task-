import java.util.*;
class dividearrayinto {
    
}
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<int []> a=new ArrayList();
        for(int i=2;i<nums.length;i+=3){
            if(nums[i]-nums[i-2]>k)return new int[][]{};
            a.add(new int[]{nums[i-2],nums[i-1],nums[i]});
        }
        return a.toArray(new int[a.size()][]);
    }
}
//leetcode 2966