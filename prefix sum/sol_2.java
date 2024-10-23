 import java.util.*;

public class sol_2 {

    public boolean checkSubarraySum(int[] n, int k) {
        Map<Integer, Integer> rMap = new HashMap<>();
        rMap.put(0, -1);
        
        int pSum = 0;
        
        for (int i = 0; i < n.length; i++) {
            pSum += n[i];
            int r = pSum % k;
            if (r < 0) {
                r += k;
            }
            
            if (rMap.containsKey(r)) {
                if (i - rMap.get(r) > 1) {
                    return true;
                }
            } else {
                rMap.put(r, i);
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        sol_2 sol = new sol_2();
        boolean result = sol.checkSubarraySum(nums, k);
        System.out.println(result);
    }
}

