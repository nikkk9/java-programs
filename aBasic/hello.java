
class hello {
    public static int func(int a[], int n) {
        // code here
        for (int i = 0; i < n; i++) {
            int num = a[i];
            int rev = 0;
            while (num != 0) {

                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }

            if (num == rev) {
                return 1;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int a[] = { 111, 222, 333 };
        System.out.println(func(a, 3));

    }
}