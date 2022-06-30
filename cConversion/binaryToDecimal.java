import java.util.Scanner;
import java.lang.Math;

class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a binary number ");
        int n = sc.nextInt();
        int ans = 0;

        for (int i = 0; n > 0; i++) {
            int rem = n % 10;
            if (rem == 1) {
                ans = ans + (int) Math.pow(2, i);
            }
            n = n / 10;
        }
        System.out.println("the answer is " + ans);
        sc.close();

    }
}