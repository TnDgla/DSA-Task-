import java.util.Scanner;

public class sol_3 {

    public int longestMountain(int[] a) {
        int n = a.length;
        if (n < 3) return 0;

        int maxLength = 0;

        for (int i = 1; i < n - 1; i++) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                int left = i;
                int right = i;

                while (left > 0 && a[left - 1] < a[left]) {
                    left--;
                }

                while (right < n - 1 && a[right + 1] < a[right]) {
                    right++;
                }

                int currentLength = right - left + 1;
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        sol_3 sol = new sol_3();
        int result = sol.longestMountain(arr);
        System.out.println(result);
    }
}
