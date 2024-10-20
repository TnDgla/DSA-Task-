import java.util.*;

class Assign_Cookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int count = 0;

        while (i < g.length && j < s.length) {
            if (s[j] < g[i]) {
                j++;
            } else if (s[j] >= g[i]) {
                i++;
                j++;
                count++;
            }
        }
        return count;
    }
}