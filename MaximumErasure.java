import java.util.HashSet;

public class MaximumErasure {
    public int maximumUniqueSubarray(int[] nums) {
        int sum=0;
        int max=0;
        int n=nums.length;
        int j=0;
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            if(s.contains(nums[i])){
                while(j<i && s.contains(nums[i])){
                    s.remove(nums[j]);
                    sum-=nums[j];
                    j++;
                }

            }
            if(!s.contains(nums[i])){
                s.add(nums[i]);
                sum+=nums[i];
            }
            max=Math.max(sum,max);
        }
        return max;
    }
}
