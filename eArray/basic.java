import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // input
        System.out.print("enter the elements ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("arrays");
        // output
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }

}
