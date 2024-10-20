public class TwoChocolates {
    public int buyChoco(int[] prices, int money) {

        int ele1=Integer.MAX_VALUE;
        int ele2=Integer.MAX_VALUE;
        for(int i:prices){
            if(i<ele1){
                ele2=ele1;
                ele1=i;
            }
            else if(i<ele2){
                ele2=i;
            }

        }
        if(ele1+ele2<=money) {
            return money-(ele1+ele2);
        }
        return money;
    }
}
