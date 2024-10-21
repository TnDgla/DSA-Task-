```java
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
         Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1); 
        int odd = 0;
        int result = 0;

        for (int num : nums) {
            if (num % 2 != 0) {
                odd++;
            }
            if (count.containsKey(odd - k)) {
                result += count.get(odd - k);
            }
            count.put(odd, count.getOrDefault(odd, 0) + 1);
        }

        return result;
        
    }
}
```