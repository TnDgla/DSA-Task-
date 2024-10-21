public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for(int paid : bills){
            if(paid==5) five++;
            else if(paid==10){
                if(five==0) return false;
                else{
                    ten++;
                    five--;
                }
            } else{
                if(ten>0 && five>0){
                    ten--;
                    five--;
                } else if(five>2){
                    five-=3;
                } else return false;
            }
        }
        return true;
    }
}
