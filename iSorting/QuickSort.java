public class QuickSort {
    static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[end] = temp;
        return i;

    }

    static void quick(int arr[], int start, int end) {
        if (start < end) {
            int pInd = partition(arr, start, end);
            quick(arr, start, pInd - 1);
            quick(arr, pInd + 1, end);

        }

    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 8, 9, 6 };
        quick(arr, 0, arr.length - 1);
        printArray(arr);

    }
}
