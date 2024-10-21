class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0; // Count of $5 bills
        int tenCount = 0; // Count of $10 bills

        for (int bill : bills) {
            if (bill == 5) {
                fiveCount++; // Increase $5 bill count
            } else if (bill == 10) {
                if (fiveCount > 0) {
                    fiveCount--; // Give $5 change
                    tenCount++; // Increase $10 bill count
                } else {
                    return false; // Cannot provide change
                }
            } else { // bill == 20
                if (tenCount > 0 && fiveCount > 0) {
                    tenCount--; // Give $10 and $5 change
                    fiveCount--;
                } else if (fiveCount >= 3) {
                    fiveCount -= 3; // Give three $5 bills as change
                } else {
                    return false; // Cannot provide change
                }
            }
        }
        return true; // Successfully provided change for all customers
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] bills1 = {5, 5, 5, 10, 20};
        System.out.println(solution.lemonadeChange(bills1)); // Output: true

        // Test case 2
        int[] bills2 = {5, 5, 10, 10, 20};
        System.out.println(solution.lemonadeChange(bills2)); // Output: false
    }
}
