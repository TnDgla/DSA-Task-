```java
class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int n=num1.length;
        int m=num2.length;
        ArrayList<Integer> ls=new ArrayList<>() ;
        for(int i=0;i<n;i++){
        ls.add(num1[i]);
                                        
 } 
        for(int i=0;i<m;i++){
        ls.add(num2[i]);
     } 
        int size=ls.size();
        int[] ans=new int[size];
        for(int i=0;i<size;i++){
        ans[i]=ls.get(i);
        }
        Arrays.sort(ans);
        if (size % 2 == 1){
        return ans[size / 2];
    }
        return (ans[(size / 2) - 1] + ans[size / 2]) / 2.0;
       }
 }
```