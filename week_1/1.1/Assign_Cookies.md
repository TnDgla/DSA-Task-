
```java
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cou = 0;
        int i = 0;
        int j = 0;
        
        while(i < g.length && j < s.length){
            if(g[i] <= s[j]){
                i++;
                j++;
                cou++;
            }
            else if(g[i] > s[i]){
                j++;
            }
        }
        return cou;
    }
}
```
