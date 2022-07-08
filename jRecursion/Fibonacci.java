public class Fibonacci {
    static void printFibo(int a, int b, int i, int n) {
        if (i > n) {
            return;
        }

        int c = a + b;
        System.out.println(c);
        printFibo(b, c, i + 1, n);
    }

    public static void main(String[] args) {
        int a = 0, b = 1, i = 1, n = 7;
        System.out.println(a);
        System.out.println(b);

        printFibo(a, b, i, n - 2);
    }

}
