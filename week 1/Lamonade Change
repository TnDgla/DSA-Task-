class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count_5 = 0;
        int count_10 =0;
        int coins=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) count_5++;
            if(bills[i]==10) count_10++;
            int change = bills[i]-5;
            if(change==0) continue;
             while(change>=10 && count_10>0){
                change-=10;
                count_10--;
            }
             while(change>=5 && count_5>0){
                change-=5;
                count_5--;
            }
            if(change!=0) return false;
        }
        return true;
    }
}