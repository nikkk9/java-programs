public class pattern {

    // NOTE - i = ROW, j = COLUMN

    public static void main(String[] args) {
        // int n = 4;

        // * * * *
        // * * * *
        // * * * *
        // * * * *
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {

        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // 1111
        // 2222
        // 3333
        // 4444
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print(i);
        // }
        // System.out.println();
        // }

        // 1234
        // 1234
        // 1234
        // 1234
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // 4444
        // 3333
        // 2222
        // 1111
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print(n - i + 1);
        // }
        // System.out.println();
        // }

        // 4321
        // 4321
        // 4321
        // 4321
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print(n - j + 1);
        // }
        // System.out.println();
        // }

        // 1 2 3 4
        // 5 6 7 8
        // 9 10 11 12
        // 13 14 15 16
        // int count = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print((count++) + " ");
        // }
        // System.out.println();

        // }

        // *
        // * *
        // * * *
        // * * * *
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();

        // }

        // 1
        // 22
        // 333
        // 4444
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i);
        // }
        // System.out.println();
        // }

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // int count = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print((count++) + " ");
        // }
        // System.out.println();

        // }

        // 1
        // 2 3
        // 3 4 5
        // 4 5 6 7
        // for (int i = 1; i <= n; i++) {
        // int count = i;
        // for (int j = 1; j <= i; j++) {
        // System.out.print((count++) + " ");
        // }
        // System.out.println();

        // }

        // 1
        // 2 1
        // 3 2 1
        // 4 3 2 1
        // for (int i = 1; i <= n; i++) {
        // int count = i;
        // for (int j = 1; j <= i; j++) {
        // System.out.print((count--) + " ");
        // }
        // System.out.println();

        // }

        // AAAA
        // BBBB
        // CCCC
        // DDDD
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // char x = (char) ('A' + i - 1);
        // System.out.print(x);
        // }
        // System.out.println();
        // }

        // ABCD
        // ABCD
        // ABCD
        // ABCD
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // char x = (char) ('A' + j - 1);
        // System.out.print(x);
        // }
        // System.out.println();
        // }

        // char count = 'A';
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print(count++);
        // }
        // System.out.println();
        // }

        // A
        // BC
        // CDE
        // DEFG
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // char count = (char) ('A' + i + j - 2);
        // System.out.print(count);
        // }
        // System.out.println();
        // }

        // star pattern
        // for (int i = 1; i <= n; i++) {
        // for (int j = n; j > i; j--) {
        // System.out.print(" ");
        // }

        // for (int k = 1; k <= i; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

    }
}
