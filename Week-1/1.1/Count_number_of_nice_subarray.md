```java
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] %= 2;
        }
        
        int []arr = new int [nums.length + 1];
        arr[0] = 1;
        int sum = 0 ;
        int ans = 0;
        
        for(int i : nums){
            sum = sum + i;
            if(sum >= k){
                 ans = ans + arr[sum - k];
            }
            arr[sum]++;
        }
        return ans;
    }
}

```