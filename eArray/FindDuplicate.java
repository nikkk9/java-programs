import java.util.Scanner;

public class FindDuplicate {
    public static void duplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter the elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        duplicate(arr);
        sc.close();
    }

}
