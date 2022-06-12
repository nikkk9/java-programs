import java.util.Scanner;

class sum {
    int addition(int a, int b) {
        return a + b;
    }
}

public class sumUsingCO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter 1st number ");
        int a = sc.nextInt();

        System.out.print("enter 2nd number ");
        int b = sc.nextInt();

        sum obj = new sum();
        int c = obj.addition(a, b);
        System.out.println("sum is " + c);

        sc.close();
    }

}
