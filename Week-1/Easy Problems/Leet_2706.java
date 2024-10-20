public class Leet_2706 {
    public int buyChoco(int[] prices, int money) {

        int firstMin = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            firstMin = Math.min(firstMin, prices[i]);
        }

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == firstMin) {
                prices[i] = 101;
                break;
            }
        }

        int secondMin = 101;
        for (int i = 0; i < prices.length; i++) {
            secondMin = Math.min(secondMin, prices[i]);
        }

        if ((firstMin + secondMin) <= money)
            return (money - (firstMin + secondMin));
        else
            return money;

    }
}
