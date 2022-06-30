
public class BubbleSort {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void bubble(int arr[]) {
        // bubble sorting = push largest element to the last index
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }
    // time complexity = O(n^2)

    public static void main(String[] args) {
        int arr[] = { 4, 3, 8, 1, 3, 2 };
        bubble(arr);
    }
}
