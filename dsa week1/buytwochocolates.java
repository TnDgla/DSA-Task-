class buytwochocolates {
    
}
class Solution {
    public int buyChoco(int[] prices, int money) {
       int m=Integer.MAX_VALUE,m2=Integer.MAX_VALUE;
       for(int i=0;i<prices.length;++i){
        if(m>prices[i]){
            m2=m;
            m=prices[i];
        }else{
            m2=Math.min(m2,prices[i]);
        }
       }
       if(m+m2<=money) return money-(m+m2);
       return money;

    }
}
//leetcode 2706