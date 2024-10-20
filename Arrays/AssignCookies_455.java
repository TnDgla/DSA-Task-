package Arrays;

import java.util.Arrays;

public class AssignCookies_455 {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int m = g.length;
        int n = s.length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (g[i] <= s[j]) {
                i++;
            }
            j++;
        }
        return i;

    }

    public static void main(String[] args) {
        int[] g = { 1, 3, 2,5 };
        int s[] = { 2, 3,4 };
        System.out.println(findContentChildren(g, s));
    }

}