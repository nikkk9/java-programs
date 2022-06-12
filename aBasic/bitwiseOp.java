public class bitwiseOp {
    public static void main(String[] args) {
        int a = 2, b = 4;

        System.out.println("a or b : " + (a | b));
        System.out.println("a and b : " + (a & b));
        System.out.println("a xor b : " + (a ^ b));
        System.out.println("negation of b : " + (~b));

        System.out.println("1 bit left shift of a : " + (a << 1));
        System.out.println("2 bit left shift of a : " + (a << 2));
        System.out.println("1 bit right shift of a : " + (a >> 1));
        System.out.println("2 bit right shift of a : " + (a >> 2));

    }
}
