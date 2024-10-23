import java.util.*;

public class sol_4 {

    public int maximumUniqueSubarray(int[] n) {
        int sum = 0;
        Set<Integer> s = new HashSet<>();
        int max = 0;
        int l = 0;
        int r = 0;
        int len = n.length;
        
        for (r = 0; r < len; r++) {
            if (s.contains(n[r])) {
                while (l < r && s.contains(n[r])) {
                    s.remove(n[l]);
                    sum -= n[l];
                    l++;
                }
            }
            if (!s.contains(n[r])) {
                s.add(n[r]);
                sum += n[r];
            }
            max = Math.max(sum, max);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
        }

        sol_4 sol = new sol_4();
        int result = sol.maximumUniqueSubarray(nums);
        System.out.println(result);
    }
}

