public class PowerOfX {
    static int calcPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        int xPowerNM1 = calcPower(x, n - 1);
        int xPower = x * xPowerNM1;
        return xPower;

    }

    public static void main(String[] args) {
        int x = 2, n = 4;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }

}
