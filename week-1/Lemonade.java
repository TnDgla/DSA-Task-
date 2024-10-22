import java.util.*;
// Leetcode 860
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int freq5 = 0;
        int freq10 = 0;
        for (int x : bills) {
            if (x == 5)
                freq5++;
            else if (x == 10 && freq5 >= 1) {
                freq10++;
                freq5--;
            } else if (x == 20 && freq10 >= 1 && freq5 >= 1) {
                freq10--;
                freq5--;
            } else if (x == 20 && freq5 >= 3) {
                freq5 -= 3;
            } else
                return false;
        }
        return true;
    }
}
