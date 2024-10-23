// public class contiguousArray {
    
// }
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int a=0,c=0;
        for(int i=0;i<nums.length;i++){
            a+=nums[i]==1?1:-1;
            if(map.containsKey(a))
                c=Math.max(c,i-map.get(a));
            else
                map.put(a,i);
        }
        return c;
    }
}