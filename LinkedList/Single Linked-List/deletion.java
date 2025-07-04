// package linkedList;

public class deletion {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Delection at first
    public void deleteFirst() {
        if (head == null)
            return;

        head = head.next;
    }

    // Deletion in between in Linked list
    public void deletionBetween(int index) {
        Node current = head;
        int count = 0;

        while (count < index - 2 && current != null) {
            current = current.next;
            count++;
        }

        if (current.next != null)
            current.next = current.next.next;

    }

    // Delete at last
    public void deleteLast() {
        Node current = head;
        if (head == null)
            return;

        while (current.next == null) {
            current = current.next;
        }
        current = current.next;
    }

    // add first code
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // display
    public void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        deletion obj = new deletion();

        obj.addFirst(22);
        obj.addFirst(45);
        obj.addFirst(25);
        obj.addFirst(77);
        obj.addFirst(11);
        obj.addFirst(21);
        obj.addFirst(15);
        obj.addFirst(87);
        obj.addFirst(61);

        obj.display();
        obj.deleteFirst();
        obj.display();
        obj.deleteLast();
        obj.display();

        obj.deletionBetween(2);
        obj.display();
    }
}
