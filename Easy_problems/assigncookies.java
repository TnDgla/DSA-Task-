package Easy_problems;

// 455. ASSign Cookies
// https://leetcode.com/problems/assign-cookies/
import java.util.*;

public class assigncookies {

    public static int findContentChildren(int[] greedFactors, int[] cookieSizes) {
        Arrays.sort(greedFactors);
        Arrays.sort(cookieSizes);
        int i = 0, j = 0;
        int count = 0;

        while (i < greedFactors.length && j < cookieSizes.length) {
            if (cookieSizes[j] >= greedFactors[i]) {
                count++;
                i++;
            }
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] greedFactors = new int[n];
        int[] cookieSizes = new int[k];

        for (int i = 0; i < n; i++) {
            greedFactors[i] = sc.nextInt();
        }

        for (int i = 0; i < k; i++) {
            cookieSizes[i] = sc.nextInt();
        }
        System.out.println(findContentChildren(greedFactors, cookieSizes));
    }
}
