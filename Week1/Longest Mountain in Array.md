```java
class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length<3) return 0;
        int ans=0;
        for(int i=1;i < arr.length-1;i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                int left=i;
                int right=i;
                while(left > 0 && arr[left-1] < arr[left]){
                    left--;
                }
                while(right < arr.length-1 && arr[right+1] < arr[right]){
                    right++;
                }
                ans=Math.max(right-left+1,ans);
            }
        }
        return ans;
    }
}

```