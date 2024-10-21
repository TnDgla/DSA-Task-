package Array_Problems;

import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] ans=twoSum(nums, target);
        for(int num:ans){
            System.out.print(num+" ");
        }

    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remain=target-nums[i];
            if(map.containsKey(remain)){
               return new int[]{map.get(remain),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    
}
