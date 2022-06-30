public class ClearBitOfNum {
    public static void main(String[] args) {
        int n = 5, pos = 2, bitMask = 1 << pos;
        int notBitMask = ~(bitMask);
        int newNum = notBitMask & n;
        System.out.println(newNum);
    }

}
