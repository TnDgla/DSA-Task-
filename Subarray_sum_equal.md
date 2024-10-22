```java


class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);  

        int sum = 0;  
        int count = 0; 

        for (int i : nums) {
            sum += i; 

           
            if (mp.containsKey(sum - k)) {
                count += mp.get(sum - k);
            }
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }

        return count; 
    }
}

```