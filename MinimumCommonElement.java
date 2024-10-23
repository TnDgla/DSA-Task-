import java.util.HashMap;

public class MinimumCommonElement {
    public static void main(String[] args) {
        int nums1[] = {1,2,3};
        int[] nums2 = {2,4};
        System.out.println(getCommon(nums1, nums2));
    }
    public static int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums2){
            if(map.containsKey(num)){
                return num;
            }
        }
        return -1;
    }
    
}
