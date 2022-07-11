public class Basic {
    Node head;

    class Node {
        String data;
        Node next;

        // Constructor
        Node(String data) {
            this.data = data;
            this.next = null;
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
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is an empty");
            return;
        }
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("list is an empty");
            return;
        }
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

    public static void main(String[] args) {
        Basic list = new Basic();
        list.addFirst("is");
        list.addFirst("java");
        list.printList();

        list.addLast("language");
        list.printList();

        list.addFirst("okay");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

    }

}
