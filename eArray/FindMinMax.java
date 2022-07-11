import java.util.Scanner;

public class FindMinMax {
    public static void min(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        System.out.println("Min value is " + min);
    }

    public static void max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println("Max value is " + max);
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

        min(arr);
        max(arr);

        sc.close();

    }

}
