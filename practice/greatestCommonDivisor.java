import java.util.Scanner;

public class greatestCommonDivisor {
    static int gcd(int n, int m) {
        int gcd = 0;
        for (int i = 1; i <= n || i <= m; i++) {
            if (m % i == 0 && n % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println("enter a number");
        int m = sc.nextInt();

        System.out.println("gcd of given number is " + gcd(n, m));
        sc.close();
    }
}
