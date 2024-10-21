```java
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i: nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        int max = 0;
        for(int i:freq.values()){
            max = Math.max(max,i);
        }
        int ans = 0;
        for (int i : freq.values()) {
            if (i == max) {
                ans += i;
            }
        }
        return ans;
    }
} 
```