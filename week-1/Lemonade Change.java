class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for(int i=0;i<bills.length;i++){
              if(bills[i]==5){
                five++;
              }
              else if(bills[i]==10){//if customer gave 10 rs
                if(five==0){
                    return false;
                }
                five--;//we will give him 5 back 
                ten++;
              }
              else{//if he has given 20 rs
                if(five>0 && ten>0){//giving 15
                    five--;
                    ten--;
                }
                else if(five>=3){//giving 15 using only 5 rs
                    five-=3;
                }
                else{
                    return false;//if no condition satisfied
                }
            }
        }
        return true;
    }
}
