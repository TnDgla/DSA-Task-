import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        for(int x=0;count<g.length && x<s.length;x++)
        {
            if(g[count]<=s[x]) count++;
        }
        return count;
    }
}