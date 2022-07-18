public class QueueWithLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        static boolean isEmpty() {
            return head == null && tail == null;
        }

        // add/enqueue
        static void add(int data) {

            Node newNode = new Node(data);
            if (tail == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove/dequeue
        static int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        // peek
        static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;

        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(5);
        q.add(3);
        q.add(9);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
