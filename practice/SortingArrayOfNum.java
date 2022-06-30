import java.util.Scanner;

public class SortingArrayOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the siae of array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter the elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // sorting in ascending order
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

}
