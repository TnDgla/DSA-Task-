import java.util.*;
public class sol_2 {
    public int buyChoco(int[] p, int m) {
        Arrays.sort(p);
        if (p[0] + p[1] <= m) {
            return m - (p[0] + p[1]);
        } else {
            return m;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        sol_2 sol = new sol_2();
        int res = sol.buyChoco(p, m);
        System.out.println(res);
    }
}
