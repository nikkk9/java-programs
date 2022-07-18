public class FindLargestValue {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 40 };
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }

}
