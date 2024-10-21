import java.util.*;

public class sol_3 {

    public int numberOfSubarrays(int[] n, int k) {
        int l = 0;
        int r = 0;
        int c = 0;
        int mc = 0;
        int res = 0;
        
        while (r < n.length) {
            if (n[r] % 2 != 0) {
                c++;
                mc = 0;
            }
            while (c == k) {
                mc++;
                if (n[l] % 2 == 1) {
                    c--;
                }
                l++;
            }
            res += mc;
            r++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        sol_3 sol = new sol_3();
        int result = sol.numberOfSubarrays(nums, k);
        System.out.println(result);
    }
}

