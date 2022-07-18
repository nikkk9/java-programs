public class CircularQueueWithArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;

        }

        static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add/enqueue
        static void add(int data) {
            if (isFull()) {
                System.out.println("queue is full");
                return;
            }
            // 1st element add
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove/dequeue
        static int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int result = arr[front];
            // single element condition
            if (front == rear) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek
        static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];

        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(5);
        q.add(3);
        q.add(9);
        System.out.println(q.remove());
        q.add(1);
        System.out.println(q.remove());
        q.add(7);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
