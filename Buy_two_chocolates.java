class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int cost=prices[0]+prices[1];
        if(money<cost){
            return money;
        }
        else{
            return money-cost;
        }
    }
}