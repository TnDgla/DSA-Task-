import java.util.*;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        
        // Modifying the nums array (replacig 0 --> -1)
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                nums[i]=-1;
             }

        int curr_sum=0;
        int max=0;
            
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);

        for(int i=0;i<nums.length;i++){
            curr_sum+=nums[i];
            if(map.containsKey(curr_sum)){
                int val=map.get(curr_sum);
                max=Math.max(max,i-val);
            }
            else
                map.put(curr_sum,i);
        }
       
       return max;
    }
}
