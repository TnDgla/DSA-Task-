import java.util.*;
public class Threesum {
    
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            Set<List<Integer>>res = new HashSet<>();
            for(int i=0;i<nums.length-1;i++){
                int left = i+1;
                int right = nums.length-1;
    
                while(left < right){
                    int sum = nums[i]+nums[left]+nums[right];
    
                    if(sum == 0){
                        res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        left++;
                        right--;
                    }
                    else if(sum < 0){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
            return new ArrayList<>(res);
    
        }
}
