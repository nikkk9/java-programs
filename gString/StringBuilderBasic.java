
public class StringBuilderBasic {
    public static void main(String[] args) {

        // string-builder allows to changes in string
        StringBuilder sb = new StringBuilder("Sony");

        // get character
        System.out.println(sb.charAt(2));

        // replace character
        sb.setCharAt(0, 'X');
        System.out.println(sb);

        // insert extra character
        sb.insert(1, 'T');
        System.out.println(sb);

        // delete character
        sb.delete(2, 3);
        System.out.println(sb);

        // get length
        System.out.println(sb.length());

    }
}
