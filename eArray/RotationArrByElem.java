public class RotationArrByElem {
    public static void rotateArr(int arr[], int d) {
        int p = 1;
        while (p <= d) {
            int last = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];

            }
            arr[arr.length - 1] = last;
            p++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5, 6, 7 };
        rotateArr(arr, 2);
    }

}
