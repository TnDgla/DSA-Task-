import java.util.*;
public class sol_6 {
    public boolean lemonadeChange(int[] b) {
        int f = 0;
        int t = 0;
        int c = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 5) f++;
            if (b[i] == 10) t++;
            int change = b[i] - 5;
            if (change == 0) continue;
            while (change >= 10 && t > 0) {
                change -= 10;
                t--;
            }
            while (change >= 5 && f > 0) {
                change -= 5;
                f--;
            }
            if (change != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] bills = new int[m];
        for (int i = 0; i < m; i++) {
            bills[i] = sc.nextInt();
        }
        sol_6 sol = new sol_6();
        boolean result = sol.lemonadeChange(bills);
        System.out.println(result);
    }
}
