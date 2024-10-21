import java.util.*;

public class sol_4 {

    public int pivotIndex(int[] n) {
        int totalSum = 0;
        int leftSum = 0;
        
        for (int ele : n) {
            totalSum += ele;
        }
        
        for (int i = 0; i < n.length; leftSum += n[i++]) {
            if (leftSum * 2 == totalSum - n[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void sol_4(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
        }

        sol_4 sol = new sol_4();
        int result = sol.pivotIndex(nums);
        System.out.println(result);
    }
}
