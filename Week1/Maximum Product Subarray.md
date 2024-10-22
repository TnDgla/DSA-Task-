```java
class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1;int sufix=1;
        int maxprod=Integer.MIN_VALUE;
        int n=nums.length-1;
        for(int i=0;i<=n;i++){
            if(prefix==0) prefix=1;
            if(sufix==0) sufix=1;
            prefix*=nums[i];
            sufix*=nums[n-i];
            maxprod=Math.max(maxprod,Math.max(prefix,sufix));
        }
        return maxprod;
    }
}
```