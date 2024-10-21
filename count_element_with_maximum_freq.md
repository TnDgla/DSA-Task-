```java
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {  
    int num = nums[i];  
    map.put(num, map.getOrDefault(num, 0) + 1);  
}
        int max=0;
        int c=0;
        for(int i:map.values()){
            max=Math.max(max,i);
        }
        for(int i:map.values()){
            if(i==max){
                c++;
            }
        }
        return c*max;
    }
}
```