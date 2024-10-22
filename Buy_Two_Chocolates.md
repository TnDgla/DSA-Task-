``` java

class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int amount= prices[0] + prices[1];
        if(amount <= money){
            return money - amount;
        }
        else{
            return money;
        }
       
    }
}
```