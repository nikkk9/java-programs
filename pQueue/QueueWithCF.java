import java.util.LinkedList;
import java.util.Queue;
// import java.util.ArrayDeque;

public class QueueWithCF {
    public static void main(String[] args) {
        // Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();

        q.add(5);
        q.add(3);
        q.add(9);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }

}
