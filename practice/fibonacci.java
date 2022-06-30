import java.util.Scanner;

public class fibonacci {

    static void fibo(int n) {
        int a = 0, b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 1; i < n; i++) {
            int nextNum = a + b;
            System.out.print(nextNum + " ");
            a = b;
            b = nextNum;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        fibo(n);
        sc.close();

    }

}
