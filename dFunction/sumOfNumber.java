import java.util.Scanner;

public class sumOfNumber {
    public static int sum(int x, int y) {
        return (x + y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num ");
        int a = sc.nextInt();
        System.out.print("enter a num ");
        int b = sc.nextInt();

        System.out.println("sum of number is " + sum(a, b));
        sc.close();
    }

}
