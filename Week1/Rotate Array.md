```java
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int z=k%n;
        rec(nums,0,n-1);
        rec(nums,0,z-1);
        rec(nums,z,n-1);
    }
    public static void rec(int[] arr,int s,int e){
        while(s<=e){
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
}
```