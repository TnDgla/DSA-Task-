```java
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n=0;
       for(int i=0;i<prices.length;i++){
        n=money-prices[0]-prices[1];
        }
        if(n>=0){
           return n;
        }
        else{
           return money;
        }
          
        }
        }
     
```