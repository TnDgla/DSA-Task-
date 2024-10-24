```java
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i]%2;
        }
        
        int []arr1 = new int [nums.length + 1];
        arr1[0] = 1;
        int sum = 0 ;
        int ans = 0;
        
        for(int num : nums){
            sum = sum + num;
            if(sum >= k){
                 ans = ans + arr1[sum - k];
            }
            arr1[sum]++;
        }
        return ans;
    }
}
    
```