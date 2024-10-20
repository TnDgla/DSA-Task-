 import java.util.*;
public class sol_1 {

    public int findMaxLength(int[] n) {
        int len = n.length;
        for (int i = 0; i < len; i++) {
            n[i] = (n[i] == 0) ? -1 : 1;
        }
        HashMap<Integer, Integer> h = new HashMap<>();
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            sum += n[i];
            if (sum == 0) {
                ans = Math.max(i + 1, ans);
            }
            if (h.containsKey(sum)) {
                ans = Math.max(i - h.get(sum), ans);
            } else {
                h.put(sum, i);
            }
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

        sol_1 sol_1 = new sol_1();
        int result = sol_1.findMaxLength(nums);
        System.out.println(result);
    }
}
