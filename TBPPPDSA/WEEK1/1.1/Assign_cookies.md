```java
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int cookie= 0;
        while (cookie < s.length && count < g.length) {
            if (s[cookie] >= g[count]) {
                count++;    
            }
            cookie++;
        }
        return count;
    }
}
```