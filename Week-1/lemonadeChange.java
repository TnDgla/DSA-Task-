public class lemonadeChange {
        public boolean solution(int[] bills) {
           int five=0;
           int ten=0;
           for(int i:bills){
            if(i==10){
                if(five>0){
                    five--;
                    ten++;
                }else
                return false;
            }
            else if(i==20){
                if(five>0 && ten>0){
                    five--;
                    ten--;
                }else if(five >=3){
                    five = five-3;
                }else
                return false;
            }else{
                five++;
            }
           } 
           return true;
        }
}
