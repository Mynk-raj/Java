public class InsertInMiddle {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addfirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add middle of linked list

    public void addMiddle(int index, int data) {
        Node newNode = new Node(data);

        if (index == 0) { // edge case: insert at head
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int count = 0;

        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        newNode.next = current.next;
        current.next = newNode;

    }

    public void display() {
        int count = 0;
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
            count++;
        }
        System.out.println("null");
        System.out.println("size of linked list : " + count);
    }

    public static void main(String[] args) {
        InsertInMiddle obj = new InsertInMiddle();

        obj.addfirst(22);
        obj.addfirst(42);
        obj.addfirst(72);

        obj.display();

        obj.addMiddle(2, 12);

        obj.display();
    }
}
