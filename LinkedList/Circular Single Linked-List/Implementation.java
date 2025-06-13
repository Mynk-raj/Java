// package LinkedList.Circular Single Linked-List;

public class Implementation {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class scl {
        private Node head;

        // Add first in single circular linked list
        public void insertAtHead(int data) {

            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                head.next = head;
            } else {
                Node current = head;
                while (current.next != head) {
                    current = current.next;
                }

                newNode.next = head;
                current.next = newNode;
                head = newNode;

            }
        }

        // Delete from head
        public void deleteFromHead() {
            if (head == null) {
                System.out.println("List is empty !");
                return;
            }

            // if list contain only one node
            if (head.next == head) {
                head = null;
                return;
            }

            Node current = head;

            while (current.next != head) {
                current = current.next;
            }

            current.next = head.next;
            head = head.next;

        }

        // Delete form tail
        public void deleteFromTail() {
            if (head == null) {
                System.out.println("List is empty !");
                return;
            }

            // if list contain only one node
            if (head.next == head) {
                head = null;
                return;
            }

            Node current = head;

            while (current.next.next != head) {
                current = current.next;
            }

            current.next = head;

        }

        // search value
        public boolean search(int key) {
            if (head == null) {
                return false;
            }

            Node current = head;

            do {
                if (current.data == key) {
                    return true;
                }
                current = current.next;
            } while (current != head);

            return false;

        }

        // length
        public int length() {
            if (head == null) {
                System.out.println("List is empty");
                return 0;
            }

            int count = 0;
            Node current = head;

            do {
                count++;
                current = current.next;
            } while (current != head);

            return count;
        }

        // Display
        public void display() {
            if (head == null) {
                System.out.println("List is empty !");
                return;
            }

            Node current = head;
            do {
                System.out.print(current.data + " --> ");
                current = current.next;
            } while (current != head);
            System.out.println("(back to head)");
        }

    }

    public static void main(String[] args) {
        Implementation a = new Implementation();
        scl obj = a.new scl();

        obj.insertAtHead(84);
        obj.insertAtHead(45);
        obj.insertAtHead(64);
        obj.insertAtHead(23);
        obj.insertAtHead(11);
        obj.insertAtHead(55);

        obj.display();

        obj.deleteFromHead();
        obj.deleteFromTail();

        obj.display();

        System.out.println("Length of circular single linked list is : " + obj.length());
        System.out.println("key is found or not : " + obj.search(11));

        obj.display();
    }
}
