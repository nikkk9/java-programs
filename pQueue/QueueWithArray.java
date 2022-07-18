public class QueueWithArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;

        }

        static boolean isEmpty() {
            return rear == -1;
        }

        // add/enqueue
        static void add(int data) {
            if (rear == size - 1) {
                System.out.println("queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // remove/dequeue
        static int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];

            }
            rear--;
            return front;
        }

        // peek
        static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];

        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.add(5);
        q.add(3);
        q.add(9);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
