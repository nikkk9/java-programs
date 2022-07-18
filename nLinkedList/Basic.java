public class Basic {
    Node head;
    // this is for get size value
    private int size;

    Basic() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        // Constructor
        Node(String data) {
            this.data = data;
            this.next = null;

            size++;

        }
    }

    // add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        // traverse
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
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

    // delete first
    public void removeFirst() {
        if (head == null) {
            System.out.println("list is an empty");
            return;
        }
        size--;

        head = head.next;
    }

    // delete last
    public void removeLast() {
        if (head == null) {
            System.out.println("list is an empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;

        // traverse
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Basic list = new Basic();
        list.addFirst("is");
        list.addFirst("java");
        list.printList();

        list.addLast("language");
        list.printList();

        list.addFirst("okay");
        list.printList();

        list.removeFirst();
        list.printList();

        list.removeLast();
        list.printList();

        System.out.println(list.getSize());

    }

}
