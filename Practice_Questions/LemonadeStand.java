public class LemonadeStand {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0, tens = 0;

        for (int bill : bills) {
            if (bill == 5) {
                fives++;
            } else if (bill == 10) {
                if (fives > 0) {
                    fives--; 
                    tens++;  
                } else {
                    return false; 
                }
            } else if (bill == 20) {
                if (tens > 0 && fives > 0) {
                    tens--; 
                    fives--; 
                } else if (fives >= 3) {
                    fives -= 3; 
                } else {
                    return false; 
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        LemonadeStand lemonadeStand = new LemonadeStand();

        // Test case 1
        int[] bills1 = {5, 5, 5, 10, 20};
        System.out.println(lemonadeStand.lemonadeChange(bills1)); 

        // Test case 2
        int[] bills2 = {5, 5, 10, 10, 20};
        System.out.println(lemonadeStand.lemonadeChange(bills2)); 
    }

}
