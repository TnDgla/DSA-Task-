``` java

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child=0;
        int g_idx=0;
        int s_idx=0;
        while(g_idx < g.length && s_idx < s.length){
            if(g[g_idx] <= s[s_idx]){
                child++;
                g_idx++;

            }
            s_idx++;
        }
        return child;
        
    }
}
```