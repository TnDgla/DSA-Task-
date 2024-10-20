public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;

        for(int i=0;i<bills.length;i++){

            if(bills[i]==5){
                five++;
                continue;
            }
            else if(bills[i]==10){
                ten++;
                if(five>=1){
                    five--;
                }
                else return false;
            }
            else{
                if(ten>=1 && five>=1){
                    ten--;
                    five-=1;
                }
                else if(five>=3) five-=3;
                else return false;
            }

            }

        return true;
    }
}
