import java.util.HashMap;

class Solution {
    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap();
        for(int i:nums){
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }

        int maxValue=0;
        int cnt=0;
        for(int i:hmap.values()){
            maxValue=Math.max(maxValue,i);
        }

        for(int i:hmap.values()){
            if(i==maxValue){
                cnt++;
            }
        }
        return cnt*maxValue;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 1, 4};
        System.out.println(maxFrequencyElements(nums1)); // Output: 4

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(maxFrequencyElements(nums2)); // Output: 5
    }
}