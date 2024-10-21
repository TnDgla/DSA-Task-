class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
       int sl=s.length-1;
       int gl=g.length-1;
       while(sl>=0 && gl>=0){
        if(s[sl]>=g[gl]){
            count++;
            sl--;
        }
        gl--;
       }
        return count;
    }
}