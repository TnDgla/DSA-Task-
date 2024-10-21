import java.util.*;

public class sol_2 {

    public int maxProduct(int[] n) {
        double p = 1;
        double s = 1;
        double m = Integer.MIN_VALUE;

        for (int i = 0; i < n.length; i++) {
            if (p == 0) {
                p = 1;
            }
            if (s == 0) {
                s = 1;
            }
            p *= n[i];
            s *= n[n.length - i - 1];
            m = Math.max(m, Math.max(p, s));
        }
        return (int) m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
        }

        sol_2 sol = new sol_2();
        int result = sol.maxProduct(nums);
        System.out.println(result);
    }
}

