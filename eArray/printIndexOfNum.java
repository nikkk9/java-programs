import java.util.Scanner;

public class printIndexOfNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.print("enter the elements of array ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("enter the number you want to find");
        int x = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                System.out.print(x + " is found at index " + i);
            } else {
                System.out.print(x + " is not found");
                break;
            }
        }
        sc.close();

    }
}
