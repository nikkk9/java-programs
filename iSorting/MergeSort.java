public class MergeSort {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void conquer(int arr[], int start, int mid, int end) {
        int merged[] = new int[end - start + 1];
        int ind1 = start;
        int ind2 = mid + 1;
        int x = 0;

        while (ind1 <= mid && ind2 <= end) {
            if (arr[ind1] <= arr[ind2]) {
                merged[x] = arr[ind1];
                x++;
                ind1++;
            } else {
                merged[x] = arr[ind2];
                x++;
                ind2++;
            }
        }
        while (ind1 <= mid) {
            merged[x] = arr[ind1];
            x++;
            ind1++;
        }
        while (ind2 <= end) {
            merged[x] = arr[ind2];
            x++;
            ind2++;
        }

        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    static void divide(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);

    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 8, 9, 6 };
        divide(arr, 0, arr.length - 1);
        printArray(arr);

    }
}