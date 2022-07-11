public class FindOccurence {
    static int firstOccr = -1, lastOccr = -1;

    public static void findOccr(String str, int idx, char elem) {

        if (idx == str.length()) {
            System.out.println("first occurence is at index " + firstOccr);
            System.out.println("last occurence is at index " + lastOccr);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == elem) {
            if (firstOccr == -1) {
                firstOccr = idx;
            } else {
                lastOccr = idx;
            }
        }
        findOccr(str, idx + 1, elem);
    }

    public static void main(String[] args) {
        String str = "bairaahauax";
        findOccr(str, 0, 'a');
    }

}
