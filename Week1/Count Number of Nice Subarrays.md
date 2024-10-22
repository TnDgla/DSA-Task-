```java
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        if(nums.length-1<k) return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int c=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0) count++;
            c+=map.getOrDefault(count-k,0);
            map.put(count,map.getOrDefault(count,0)+1);
        }
        return c;
    }
}
```