import java.util.Arrays;
import java.util.Scanner;

public class sol_4 {

    public int[][] divideArray(int[] n, int k) {
        int len = n.length;
        if (len % 3 != 0) {
            return new int[0][0];
        }

        Arrays.sort(n);
        int[][] res = new int[len / 3][3];
        int c = 0;

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (c < len - 1 && (c + 3) % 3 == 0 && n[c + 2] - n[c] > k) {
                    return new int[0][0];
                }
                res[i][j] = n[c++];
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

        int k = sc.nextInt();
        sol_4 sol = new sol_4();
        int[][] result = sol.divideArray(nums, k);
        System.out.println(Arrays.deepToString(result));
    }
}

