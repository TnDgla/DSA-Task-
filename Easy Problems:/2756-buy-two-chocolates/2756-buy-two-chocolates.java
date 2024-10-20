class Solution {
    public int buyChoco(int[] prices, int money) {
    
    // SOLUTION 1
    // TIME COMPLEXITY = O(NLOG(N))
    //     Arrays.sort(prices);
    //     if(prices[0]+prices[1] <= money) return money-(prices[0]+prices[1]);
    //     return money;
    

    // SOLUTION 2
    //TIME COMPLEXITY = O(N)
    int min1=Integer.MAX_VALUE;
    int min2=Integer.MAX_VALUE;
    for(int x:prices)
    {
       if(x<min1)
       {
           min2=min1;
           min1=x;
       }
       else if(x<min2) 
        min2=x;
    }
    if(min1+min2 <= money) return money-(min1+min2);
    return money;
    
     }
}