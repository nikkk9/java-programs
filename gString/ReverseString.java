public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("America");
        int start = 0, end = sb.length() - 1;

        while (start <= end) {
            char frontChar = sb.charAt(start);
            char backChar = sb.charAt(end);
            sb.setCharAt(start, backChar);
            sb.setCharAt(end, frontChar);
            start++;
            end--;

        }

        System.out.println(sb);

    }

}
