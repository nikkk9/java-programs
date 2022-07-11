public class SwapAlter {
    static void swapAlter(int arr[]) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (i < i + 1) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 2, 1, 6, 9, 7, 8 };
        swapAlter(arr);
    }

}
