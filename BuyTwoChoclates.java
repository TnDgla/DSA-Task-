import java.util.Arrays;

public class BuyTwoChoclates {
    public static void main(String[] args) {
        int[] prices={1,2,2};
        int money=3;
        System.out.println(buyChoco(prices, money));
    }
    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if(prices[0]+prices[1]<=money) return money-prices[0]-prices[1];
        return money;
    }
    
}
