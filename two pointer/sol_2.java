import java.util.*;
public class sol_2 {
    public int threeSumClosest(int[] n, int t) {
        Arrays.sort(n);
        int closestSum = Integer.MAX_VALUE / 2;

        for (int i = 0; i < n.length - 2; ++i) {
            int left = i + 1, right = n.length - 1;
            while (left < right) {
                int currentSum = n[i] + n[left] + n[right];
                if (Math.abs(currentSum - t) < Math.abs(closestSum - t)) {
                    closestSum = currentSum;
                }
                if (currentSum < t) {
                    ++left;
                } else if (currentSum > t) {
                    --right;
                } else {
                    return currentSum;
                }
            }
        }

        return closestSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sol_2 sol = new sol_2();
        int result = sol.threeSumClosest(nums, target);
        System.out.println(result);
    }
}
