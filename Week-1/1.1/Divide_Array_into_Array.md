```java
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums); 
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i += 3) {
           
            int[] group = Arrays.copyOfRange(nums, i, Math.min(i + 3, nums.length));

           
            if (group.length == 3 && group[2] - group[0] > k) {
                return new int[0][0]; 
            }
            
            result.add(group);
        }

       
        return result.toArray(new int[result.size()][]);
    }
}
```