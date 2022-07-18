
public class ReverseNode {
    Node head;

    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // iterative way
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // recursive way
    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // print list
    public void printList() {
        if (head == null) {
            System.out.println("list is an empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

    public static void main(String[] args) {
        ReverseNode list = new ReverseNode();
        list.head = new Node(4);
        list.head.next = new Node(6);
        list.head.next.next = new Node(9);

        list.printList();
        // list.reverseIterate();
        // list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();

    }

}
