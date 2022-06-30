import java.util.Scanner;

public class UpdateBitOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter bit you want to change with it");
        int op = sc.nextInt();
        int n = 5, pos = 1, bitMask = 1 << pos;
        // operator =1 -> set bit , operator=0 -> clear bit
        // int operator=1; //update bit to 1

        if (op == 1) {
            // set bit
            int newNum = bitMask | n;
            System.out.println(newNum);
        } else {
            int notBitMask = ~(bitMask);
            int newNum = notBitMask & n;
            System.out.println(newNum);
        }
        sc.close();

    }

}
