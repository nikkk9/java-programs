import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueUsingTwoStacks {
    static class QueueClass {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        static boolean isEmpty() {
            return s1.isEmpty();
        }

        static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        static int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return s1.pop();
        }

        static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        QueueClass q = new QueueClass();

        q.add(5);
        q.add(3);
        q.add(9);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }

}
