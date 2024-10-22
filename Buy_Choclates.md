```java
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if(prices.length < 2){
            return money;
        }
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i] < money && prices[j] < money){
                if((prices[i] + prices[j]) <= money){
                    return  money - (prices[i] + prices[j]);
                }
                }
            }
        }
        return money;
    }
}
```