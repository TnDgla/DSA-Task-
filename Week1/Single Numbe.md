```java
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int [] freq = new int [n];
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    freq[i]++;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(freq[i]==1){
                return nums[i];
            }
        }
        return 0;
    }
}
```