class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int i=0;
        int sum=0;
        int ans=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(set.contains(nums[j])){
                sum-=nums[i];
                set.remove(nums[i++]);
            }
            set.add(nums[j]);
            // System.out.println(i+" "+j);
            ans=Math.max(ans,sum);
            
        }
        return ans;

    }
}