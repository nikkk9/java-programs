import java.util.Scanner;

// print 0 to n numbers 
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        sc.close();

    }
}
