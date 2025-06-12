// package LinkedList;

public class practice {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void addFirst(int data) { // Add first code in linked list in java
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        
        Node last = new Node(data);
        
        if (head == null) {
            head = last;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = last;

    }

    public void display() { // Display code in Linked list !!
        Node current = head;

        if (current == null) {
            System.out.println("List is empty");
        }

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        practice ll = new practice();

        // ll.addFirst(22);
        // ll.addFirst(44);
        // ll.addFirst(52);
        // ll.addFirst(34);
        // ll.addFirst(11);
        // ll.display();

        ll.addLast(3);
        ll.addLast(45);
        ll.display();

    }
}
