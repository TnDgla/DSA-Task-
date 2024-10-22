import java.util.Arrays;

class buyChocolates {
    public int buyChoco(int[] prices, int money) {
        // Sort the array to get the cheapest chocolates first
        Arrays.sort(prices);
        
        // Check the sum of the two cheapest chocolates
        int sumOfTwo = prices[0] + prices[1];
        
        // If you can afford the two cheapest chocolates, return the leftover money
        if (money >= sumOfTwo) {
            return money - sumOfTwo;
        }
        
        // Otherwise, return the original money since you can't buy two chocolates
        return money;
    }

    public static void main(String[] args) {
        buyChocolates sol = new buyChocolates();
        
        // Example 1
        int[] prices1 = {1, 2, 2};
        int money1 = 3;
        System.out.println(sol.buyChoco(prices1, money1)); // Output: 0
        
        // Example 2
        int[] prices2 = {3, 2, 3};
        int money2 = 3;
        System.out.println(sol.buyChoco(prices2, money2)); // Output: 3
    }
}
