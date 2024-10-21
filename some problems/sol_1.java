import java.util.*;

public class sol_1 {

    public int maxArea(int[] h) {
        int max = 0;
        int l = 0;
        int r = h.length - 1;

        while (l < r) {
            int lv = Math.min(h[l], h[r]);
            int bv = r - l;
            int area = lv * bv;
            if (max < area) {
                max = area;
            }
            if (h[l] < h[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }

    public static void sol_1(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] h = new int[m];
        for (int i = 0; i < m; i++) {
            h[i] = sc.nextInt();
        }

        sol_1 sol = new sol_1();
        int result = sol.maxArea(h);
        System.out.println(result);
    }
}
