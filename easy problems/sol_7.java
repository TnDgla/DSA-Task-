import java.util.*;

public class sol_7 {

    public int getCommon(int[] n1, int[] n2) {
        int l1 = 0, l2 = 0, r1 = n1.length - 1, r2 = n2.length - 1;

        while (l1 <= r1 && l2 <= r2) {
            if (n1[l1] == n2[l2]) {
                return n1[l1];
            }

            if (n1[l1] < n2[l2]) {
                l1++;
            } else {
                l2++;
            }

            if (n1[r1] < n2[r2]) {
                r2--;
            } else if (n1[r1] == n2[r2]) {
            } else {
                r1--;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] nums1 = new int[m];
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        sol_7 sol = new sol_7();
        int result = sol.getCommon(nums1, nums2);
        System.out.println(result);
    }
}
