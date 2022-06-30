public class InsertionSort {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void insertion(int arr[]) {
        // insertion sorting= values from the unsorted part are picked and placed at the
        // correct position in the sorted part.
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            int j = i - 1;
            while (j >= 0 && currentValue < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentValue;
        }
        printArray(arr);
    }

    // time complexity = O(n^2)

    public static void main(String[] args) {
        int arr[] = { 4, 3, 8, 1, 3, 5, 2 };
        insertion(arr);
    }
}
