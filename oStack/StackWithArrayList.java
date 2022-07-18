import java.util.ArrayList;

public class StackWithArrayList {
    static class Stack {

        static ArrayList<Integer> list = new ArrayList<>();

        boolean isEmpty() {
            return list.size() == 0;
        }

        // add data on top in stack
        void push(int data) {
            list.add(data);
        }

        // remove data on top in stack
        int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // get data on top in stack
        int peek() {
            return list.get(list.size() - 1);
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        // System.out.println(s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.peek());

        // get all data while stack will be not empty
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }

}