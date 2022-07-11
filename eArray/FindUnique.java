public class FindUnique {
    public static void uniqueValue(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 2, 1, 6, 9, 7, 7, 8 };
        uniqueValue(arr);
    }
}
