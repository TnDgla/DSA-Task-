class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = Math.min(prices[0], prices[1]);
        int min2 = Math.max(prices[0], prices[1]);

        for(int i=2; i<prices.length; i++) {
            if(min1 > prices[i]){
                min2 = min1;
                min1 = prices[i];
            }
            else{
                min2 = Math.min(min2,prices[i]);
            }
        }

        return money >= min1+min2 ? money-min1-min2 : money;
    }
}