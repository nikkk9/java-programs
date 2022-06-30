public class Print1ToN {
    static void printNum(int i, int n) {
        // base case
        if (i > n) {
            return;
        }
        // printing
        System.out.println(i);

        // recursion
        printNum(i + 1, n);
    }

    public static void main(String[] args) {
        int i = 1, n = 5;
        printNum(i, n);

    }

}
