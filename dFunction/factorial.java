import java.util.Scanner;

public class factorial {
    public static void fact(int n) {

        if (n < 0) {
            System.out.println("Invalid number");
            return;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num ");
        int n = sc.nextInt();
        fact(n);
        sc.close();
    }
}
