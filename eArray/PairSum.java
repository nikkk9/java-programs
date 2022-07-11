public class PairSum {
    public static void pairSum(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 2, 1, 6, 9, 7, 7, 8 };
        int x = 6;
        pairSum(arr, x);
    }
}
