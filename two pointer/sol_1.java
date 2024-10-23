import java.util.*;
public class sol_1 {

    public List<List<Integer>> threeSum(int[] n) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(n);
        for (int i = 0; i < n.length; i++) {
            if (i > 0 && n[i] == n[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = n.length - 1;
            while (j < k) {
                int sum = n[i] + n[j] + n[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    res.add(Arrays.asList(n[i], n[j], n[k]));
                    j++;
                    while (j < k && n[j] == n[j - 1]) {
                        j++;
                    }
                }
            }
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

        sol_1 sol = new sol_1();
        List<List<Integer>> result = sol.threeSum(nums);
        System.out.println(result);
    }
}

