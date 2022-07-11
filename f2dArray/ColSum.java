public class ColSum {
    static void sumOfCol(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.print(sum + " ");
        }

    }

    public static void main(String[] args) {
        int arr[][] = { { 3, 2, 4 }, { 4, 7, 9 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        sumOfCol(arr);
    }
}
