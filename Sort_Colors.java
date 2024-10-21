package Array_Problems;

import java.util.HashMap;

public class Sort_Colors {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        sort(nums);
    }
    public static void sort(int[] nums){
        int[] count=new int[3];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int idx=0;
        for(int i=0;i<count.length;i++){
            if(i==0){
                while(count[i]>0){
                    nums[idx++]=i;
                    count[i]--;
                }
            }
            if(i==1){
                while(count[i]>0){
                    nums[idx++]=i;
                    count[i]--;
                }
            }
            if(i==2){
                while(count[i]>0){
                    nums[idx++]=i;
                    count[i]--;
                }
            }
        } 

        // approach using hashmap
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // int idx=0;
        // for(int key:map.keySet()){
        //     if(key==0){
        //         while(map.get(key)>0){
        //             nums[idx++]=key;
        //             map.put(key,map.get(key)-1);
        //         }
        //     }
        //     if(key==1){
        //         while(map.get(key)>0){
        //             nums[idx++]=key;
        //             map.put(key,map.get(key)-1);
        //         }
        //     }
        //     if(key==2){
        //         while(map.get(key)>0){
        //             nums[idx++]=key;
        //             map.put(key,map.get(key)-1);
        //         }
        //     }
        // }
    }
    
}
