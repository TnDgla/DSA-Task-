class Solution {
    public int buyChoco(int[] prices, int money) {
       int min=Integer.MAX_VALUE,secondMin=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
           if(prices[i]<min){
            secondMin=min;
            min=prices[i];
           }else if(prices[i]<secondMin){
            secondMin=prices[i];
           }
        }
        if((min+secondMin)<=money) return money-(min+secondMin);
        return money;
    }
}