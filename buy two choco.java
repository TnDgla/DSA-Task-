class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int total=prices[0]+prices[1];
        if(total<=money){
            return money-total;
        }
        else{
            return money;
        }
    }
}
