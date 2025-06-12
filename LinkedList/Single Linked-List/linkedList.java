

public class linkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    // printing linked list

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();

        Node ll = list.new Node(44);

        list.addFirst(33);
        list.addFirst(22);
        list.addFirst(67);

        list.display();

        // System.out.println(ll.data + " " + ll.next);
    }
}
