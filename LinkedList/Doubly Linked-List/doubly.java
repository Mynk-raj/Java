// package Doubly Linked-List;

public class doubly {

    // Node class for doubly linked list
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;

    class doublyLl {

        // Add first program for double linked list
        public void insertAtHead(int data) {
            Node newNode = new Node(data);

            if (head != null) {
                head.prev = newNode;
            }

            newNode.next = head;
            newNode.prev = null;
            head = newNode;
        }

        // Add last or tail program for doubly linked list
        public void insertAtTail(int data) {
            Node newNode = new Node(data);
            Node current = head;

            if (head == null) {
                head = newNode;
                return;
            }

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
            newNode.prev = current;

        }

        // Delete from head
        public void deleteFromHead() {
            if (head == null) {
                System.out.println("List is empty !");
                return;
            }
            if (head != null) {
                head.prev = null;
                head = head.next;
            }

        }

        // Delete from backword
        public void deleteFromBackword() {
            if (head == null) {
                System.out.println("List is empty !");
                return;
            }

            if (head.next == null) {
                // Only one node in the list
                head = null;
                return;
            }

            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }

            current.next = null;

        }

        // Display forward for doubly linked list
        public void displayForward() {
            Node current = head;

            if (current == null) {
                System.out.println("List is empty!");
                return;
            }

            while (current != null) {
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.out.println("null");
        }

        // Display form backword for doubly Linked list
        public void displayFromBackword() {
            if (head == null) {
                System.out.println("List is empty !");
                return;
            }

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            while (current != null) {
                System.out.print(current.data + " --> ");
                current = current.prev;
            }
            System.out.println("null");

        }
    }

    public static void main(String[] args) {
        doubly a = new doubly();

        doublyLl obj = a.new doublyLl();

        obj.insertAtHead(22);
        obj.insertAtHead(4);
        obj.insertAtHead(12);
        obj.insertAtHead(74);
        obj.insertAtHead(62);

        obj.displayForward();

        obj.insertAtTail(12);
        obj.insertAtTail(21);
        obj.insertAtTail(10);

        obj.deleteFromBackword();
        obj.deleteFromBackword();

        obj.displayForward();
        obj.displayFromBackword();

    }
}
