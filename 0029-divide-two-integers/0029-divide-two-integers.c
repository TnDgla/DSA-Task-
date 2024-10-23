int divide(int dividend, int divisor) {
        return (dividend == -2147483648 && divisor == -1)? INT_MAX:dividend/divisor;

}