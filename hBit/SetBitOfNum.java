public class SetBitOfNum {
    public static void main(String[] args) {
        int n = 5, pos = 1, bitMask = 1 << pos;
        int newNum = bitMask | n;

        System.out.println(newNum);
    }
}
