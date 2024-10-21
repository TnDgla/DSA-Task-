import java.util.*;

public class sol_3 {

    public int subarraySum(int[] n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int c = 0;
        int x = 0;

        for (int i = 0; i < n.length; i++) {
            x += n[i];
            if (map.containsKey(x - k)) {
                c += map.get(x - k);
            }
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        return c;
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
        int result = sol.subarraySum(nums, k);
        System.out.println(result);
    }
}

