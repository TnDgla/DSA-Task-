// 2706. Buy Two Chocolates
// https://leetcode.com/problems/buy-two-chocolates/
package Easy_problems;

public class twochoclates {
    public int buy_2(int[] prices, int money) {
        int n = prices.length;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (min1 > prices[i]) {
                min2 = min1;
                min1 = prices[i];

            } else if (min2 > prices[i]) {
                min2 = prices[i];
            }
        }

        return (money < (min1 + min2)) ? money : money - (min1 + min2);
    }
}
