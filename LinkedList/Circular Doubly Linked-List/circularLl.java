// package LinkedList.Circular Linked-List;

public class circularLl {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // creation of Double circular linked list in java

    public class CircularList {

        private Node head = null;
        private Node tail = null;

        // Add backword in circular doubly linked list
        public void insertAtTail(int data) {
            Node newNode = new Node(data);
            Node current = head;

            if (head == null) {
                head = newNode;
                tail = newNode;
                tail.next = head;

            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }

        }

        // Display in circular doubly linked list
        public void display() {
            Node current = head;
            if (current == null) {
                System.out.println("List is empty !");
                return;
            }

            do {
                System.out.print(current.data + " --> ");
                current = current.next;
            } while (current != head);
            System.out.println("(back to head)");
        }
    }

    public static void main(String[] args) {
        circularLl a = new circularLl();
        CircularList obj = a.new CircularList();

        obj.insertAtTail(55);
        obj.insertAtTail(41);
        obj.insertAtTail(78);
        obj.insertAtTail(23);
        obj.insertAtTail(45);

        obj.display();
    }
}
