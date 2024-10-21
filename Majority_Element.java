package Array_Problems;

import java.util.HashMap;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        int ans=0;
        for(int key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                ans=key;
            }
        }
        return ans;
    }
    
}
