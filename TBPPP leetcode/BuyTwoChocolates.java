import java.util.Arrays;
import java.util.Scanner;

public class BuyTwoChocolates {
    public int buyChocolates(int[] prices, int money) {
        // Sort the prices to find the two cheapest chocolates
        Arrays.sort(prices);
        
        // Check if we can buy at least two chocolates
        if (prices.length < 2) {
            return money; // Not enough chocolates to buy
        }
        
        // Calculate the total cost of the two cheapest chocolates
        int totalCost = prices[0] + prices[1];
        
        // Check if we can afford the chocolates
        if (totalCost > money) {
            return money; // Not enough money to buy two chocolates
        }
        
        // Calculate leftover money after the purchase3
        
        return money - totalCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for chocolate prices
        System.out.print("Enter the number of chocolates: ");
        int numChocolates = scanner.nextInt();
        int[] prices = new int[numChocolates];
        
        System.out.println("Enter the prices of the chocolates:");
        for (int i = 0; i < numChocolates; i++) {
            prices[i] = scanner.nextInt();
        }
        
        // Input for available money
        System.out.print("Enter the amount of money you have: ");
        int money = scanner.nextInt();

        BuyTwoChocolates solution = new BuyTwoChocolates();
        int result = solution.buyChocolates(prices, money);
        System.out.println("Money leftover after buying two chocolates: " + result);
        
        scanner.close();
    }
}
