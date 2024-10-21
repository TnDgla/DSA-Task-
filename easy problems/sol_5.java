import java.util.*;

public class sol_5 {

    public List<String> commonChars(String[] w) {
        int n = w.length, j;
        int[][] f = new int[n - 1][26];
        for (int i = 1; i < n; i++)
            for (char c : w[i].toCharArray())
                f[i - 1][c - 'a']++;
        List<String> res = new ArrayList<>();
        for (char c : w[0].toCharArray()) {
            for (j = 1; j < n; j++) {
                if (f[j - 1][c - 'a'] > 0)
                    f[j - 1][c - 'a']--;
                else
                    break;
            }
            if (j == n)
                res.add(c + "");
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        sc.nextLine();  
        String[] words = new String[m];
        for (int i = 0; i < m; i++) {
            words[i] = sc.nextLine();
        }

        sol_5 sol = new sol_5();
        List<String> result = sol.commonChars(words);
        System.out.println(result);
    }
}
