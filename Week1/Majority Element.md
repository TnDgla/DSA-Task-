```java
class Solution {
    public int majorityElement(int[] nums) {
        int max=Integer.MIN_VALUE;
        int num=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        for(int k:map.keySet()){
            if(max<map.get(k)){
                max=map.get(k);
                num=k;
            }
        } 
        
        return num;
    }
}
```