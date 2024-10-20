class Solution {
    public int buyChoco(int[] prices, int money) {
       Arrays.sort(prices);
       int n=prices.length;
       for(int i=0;i<n;i++){
        if(prices[0]+prices[1]<=money){
            money-=prices[i]+prices[i+1];
            break;
        }
       }
       return money;
    }
}