public class TripletSum {
    static void tripletSum(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == x) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 2, 1, 6, 9, 7, 7, 8 };
        int x = 7;
        tripletSum(arr, x);
    }

}
