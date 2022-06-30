import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a decimal number ");
        int n = sc.nextInt();
        int ans = 0;

        for (int i = 0; n > 0; i++) {
            int rem = n % 2;
            ans = rem * i;
            n = n / 2;

        }
        System.out.println("the answer is " + ans);

        sc.close();
    }

}
