class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum=prices[0]+prices[1];
        int remaining = money-sum;
        if(sum<=money){
           return remaining;
        }
           return money;
    }
}
