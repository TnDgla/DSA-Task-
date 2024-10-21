import java.util.Scanner;

public class sol_3 {

    public int maxFreqElements(int[] n) {
        int len = n.length;
        int freq[] = new int[len];
        int vis[] = new int[len];
        int totalFreq = 0;

        for (int i = 0; i < len; i++) {
            if (vis[i] == 1) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < len; j++) {
                if (n[i] == n[j]) {
                    count++;
                    vis[i] = 1;
                }
            }

            freq[i] = count;
        }
         
        int max = 0;
        for (int value : freq) {
            max = Math.max(max, value);
        }

        for (int value : freq) {
            if (value == max) {
                totalFreq += value;
            }
        }

        return totalFreq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sol_3 sol = new sol_3();
        int res = sol.maxFreqElements(nums);
        System.out.println(res);
    }
}

