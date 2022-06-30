import java.util.Scanner;

public class FindNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int rows = sc.nextInt();
        System.out.println("enter col size");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        // take input
        System.out.println("enter the elements of matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the number you want to find");
        int n = sc.nextInt();

        // get output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == n) {
                    System.out.println(n + " is found at index number " + "(" + i + "," + j + ")");
                }
            }
        }
        sc.close();
    }
}
