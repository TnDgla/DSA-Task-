public class BuyTwoChocolates {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 4}; 
        int money = 5;

        BuyTwoChocolates solver = new BuyTwoChocolates();
        int result = solver.buyChoco(prices, money);
        System.out.println(result);
    }
    
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                smin = min;
                min = prices[i];
            } else {
                smin = Math.min(prices[i], smin);
            }
        }

        int sum = min + smin;
        if (sum > money) {
            return money;
        }

        return money - sum;
    }
}
