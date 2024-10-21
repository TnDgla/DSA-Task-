import java.util.*;

public class sol_5 {

    public int[] getAverages(int[] n, int k) {
        int len = n.length;
        int[] ans = new int[len];
        Arrays.fill(ans, -1);
        
        if (k == 0) {
            return n;
        }

        if (len < 2 * k + 1) {
            return ans;
        }

        int l = 0;
        int r = 2 * k;
        long sum = 0;
        int i = k;
        
        for (int j = l; j <= r; j++) {
            sum += n[j];
        }
        
        ans[i] = (int)(sum / (2 * k + 1));
        i++;
        r++;
        
        while (r < len) {
            sum = sum - n[l] + n[r];
            ans[i] = (int)(sum / (2 * k + 1));
            i++;
            r++;
            l++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        sol_5 sol = new sol_5();
        int[] result = sol.getAverages(nums, k);
        System.out.println(Arrays.toString(result));
    }
}

