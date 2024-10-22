import java.util.Arrays;

public class buyTwoChocolates {
    public int buyChoco1(int[] prices, int money) {
        Arrays.sort(prices);
      int sum = prices[0]+prices[1];
      if(sum > money){
        return money;
      }
      return money-sum;
    }

    public int buyChoco2(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int x: prices){
         if(x < min1){
             min2 = min1;
             min1 = x;
         }else{
            min2 = Math.min(min2,x); 
         }
        }
        if(min1 + min2 <= money){
         return money - (min1 + min2);
        }
             return money;
     }
}

