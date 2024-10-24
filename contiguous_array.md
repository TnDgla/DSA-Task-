```java
 class Solution {
    public int findMaxLength(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i=0; i<n; i++){
            if(arr[i]==0) arr[i]=-1;
        }

        hp.put(0,-1);
        int ans = 0;
        int sum = 0;

        for(int i=0; i<n; i++){
            sum+=arr[i];
            if(hp.containsKey(sum)){
                ans = Math.max(ans,i-hp.get(sum));
            }else hp.put(sum,i);
        }
        return ans;
    }
}
       
```