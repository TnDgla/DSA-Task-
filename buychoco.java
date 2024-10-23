class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);   
        int max=prices[0]+prices[1];
        if(max>money){
            return money;
        }
        return money-max;
    }
}