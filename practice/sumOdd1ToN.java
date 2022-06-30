import java.util.Scanner;

public class sumOdd1ToN {

    public static int odd(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                ans = ans + i;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        System.out.println(odd(n));
        sc.close();
    }

}
