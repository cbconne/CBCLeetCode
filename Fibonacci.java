public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n <= 2) {
            return 1;
        }
        int res = 1;
        int resl = 1;
        for (int i = 3; i <= n; i++) {
            res = res + resl;
            resl = res - resl;
        }
        return res;
    }
}
