```java
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i: nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int max = 0;
        for(int i:mp.values()){
            max = Math.max(max,i);
        }
        int ans = 0;
        for (int i : mp.values()) {
            if (i == max) {
                ans += i;
            }
        }
        return ans;
    }
}
```