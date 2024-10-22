class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0]!=5)
            return false;
        int n5=1;
        int n10=0;
        int n=bills.length;
        for(int x=1;x<n;x++)
        {
            if(bills[x]==5)
                n5++;
            if(bills[x]==10)
            {
                n5--;
                n10++;
            }
            if(bills[x]==20)
            {
                n5--;
                if(n10>0)
                    n10--;
                else
                    n5-=2;
            }
            if(n5<0 || n10<0)
                return false;
        }
        return true;
    }
}