import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int g1=g.length-1;
        int s1=s.length-1;
        // int count=0;
        // while(g1>=0 && s1>=0){
        //     if(g[g1]<=s[s1]){
        //         count++;
        //         s1--;
        //     }
        //     g1--;
        //}
        //return count;

        int i=0,j=0;
        while(i<=g1 && j<=s1){
            if(g[i]<=s[j]){
                i++;
            }
            j++;
        }
        return i;
    }
}
