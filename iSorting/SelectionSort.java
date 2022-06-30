public class SelectionSort {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void selection(int arr[]) {
        // selection sorting = push smallest value in first index
        for (int i = 0; i < arr.length - 1; i++) {
            int minValue = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minValue] > arr[j]) {
                    minValue = j;
                }
            }
            int temp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
    // time complexity = O(n^2)

    public static void main(String[] args) {
        int arr[] = { 4, 3, 8, 1, 3, 5, 2 };
        selection(arr);
    }
}
