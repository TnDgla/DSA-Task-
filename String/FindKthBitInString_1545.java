
package String;

public class FindKthBitInString_1545 {

    public static char findKthBit(int n, int k) {
        if (n == 1) {
            return '0';
        }
        int length = (1 << n) - 1;
        if (k < Math.ceil(length / 2.0)) {
            return findKthBit(n - 1, k);
        } else if (k == Math.ceil(length / 2.0)) {
            return '1';
        } else {
            char ch = findKthBit(n - 1, (length - (k - 1)));
            return (ch == '0') ? '1' : '0';
        }
    }

}
