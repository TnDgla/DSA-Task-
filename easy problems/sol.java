import java.util.*;
// 1st Question 
public class sol {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        
        while (i < s.length && j < g.length) {
            if (s[i] >= g[j]) {
                j++;
            }
            i++;
        }
        
        return j;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] g = new int[n];
        for (int i = 0; i < n; i++) {
            g[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] s = new int[m];
        for (int i = 0; i < m; i++) {
            s[i] = sc.nextInt();
        }
        sol sol = new sol();
        int res = sol.findContentChildren(g, s);
        System.out.println(res);
    }
}
