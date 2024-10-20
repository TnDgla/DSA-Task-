class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum=0;
        Set<Integer>s=new HashSet<>();
        int max=0;
        int l=0;
        int r=0;
        int n=nums.length;
        for(r=0;r<n;r++)
        {
            if(s.contains(nums[r]))
            {
                while( l<r &&s.contains(nums[r]))
                {
                    s.remove(nums[l]);
                     sum-=nums[l];
                    l++;
                   
                }
            }
            if(!s.contains(nums[r]))
            {
                 s.add(nums[r]);
                 sum+=nums[r];
                 
            }
            max=Math.max(sum,max);
           
        }
        return max;
    }
}