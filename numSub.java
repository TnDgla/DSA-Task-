class Solution {
    public int numSub(String s) {
        long count = 0;
        int n = 0;
        long mod = 1000000007;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count = (count + ++n);
            } else {
                n = 0;
            }
        }
        return (int) (count % mod);
    }
}