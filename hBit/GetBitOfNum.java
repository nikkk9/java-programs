
public class GetBitOfNum {
    public static void main(String[] args) {
        // bit mask =(get,add,update,delete)mask
        int n = 5, pos = 2, bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }
}
