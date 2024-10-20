package Arrays;

import java.util.Arrays;

public class BuyTwoChocolates_2706 {
    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i < 2) {
                sum += prices[i];
            }
        }
        int result = money - sum;
        return (result >= 0) ? result : money;
    }

    public static void main(String[] args) {
        int[] prices = { 2, 3, 2 };
        System.out.println(buyChoco(prices, 3));
    }
}
