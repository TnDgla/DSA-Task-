import java.util.*;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int left=1;
        int right=Arrays.stream(piles).max().getAsInt();
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int time=calculate(piles,mid);
            if(time<=h) right=mid-1;
            else left=mid+1; 
        }
        return left;
    }
    public int calculate(int piles[],int h)
    {
        int hrs=0;
        for(int x=0;x<piles.length;x++)
        {
            hrs+=Math.ceil((double)piles[x]/(double)h);
        }
        return hrs;
    }
}