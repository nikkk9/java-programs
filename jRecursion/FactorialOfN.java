public class FactorialOfN {
    static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        // factorial of (n-1)
        int factOfNM1 = factorial(n - 1);
        int factOfN = n * factOfNM1;
        return factOfN;

    }

    public static void main(String[] args) {
        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);
    }

}
