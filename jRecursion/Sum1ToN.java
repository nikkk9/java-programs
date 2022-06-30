public class Sum1ToN {
    static void printSum(int i, int n, int sum) {
        // base case
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printSum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        int i = 1, n = 5, sum = 0;
        printSum(i, n, sum);
    }

}
