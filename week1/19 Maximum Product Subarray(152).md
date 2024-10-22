```java
class Solution {
    public int maxProduct(int[] nums) {
     int max=Integer.MIN_VALUE,n=nums.length,p=1,s=1;
     for(int i=0;i<n;i++){
        if(p==0) p=1;
        if(s==0) s=1;
        p*=nums[i];
        s*=nums[n-i-1];
        max=Math.max(Math.max(p,s),max);
     }
     return max;
    }
}
```