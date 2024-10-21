```java
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n= prices.length-1;
        for(int i=0;i<n;i++){
            if(prices[i]+prices[i+1]<=money){
                int left=money-(prices[i]+prices[i+1]);
                return left;
            }
        }
        return money;
    }
}
```