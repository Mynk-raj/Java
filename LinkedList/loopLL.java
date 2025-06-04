public class loopLL {

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // creating loop in Linked list using given index
    public void loopLL(int index) {
        Node current = head;
        Node last = head;
        int count = 0;

        while (count < index && current != null) {
            current = current.next;
            count++;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = current;

    }

    // check our linked lost have any loop or not
    public boolean isloop() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            } else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }

        return false;
    }

    // Add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Display
    public void display() {

        int count = 0;

        if (head == null) {
            System.out.println("Empty Linked list ");
        }

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
            count++;
        }
        System.out.println("null");

        if (count == 50)
            System.out.println("...loop detected or too long.");
        else
            System.out.println("null");
    }

    // Add last code
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        // newNode.next = null;

    }

    public static void main(String[] args) {
        loopLL obj = new loopLL();

        obj.addFirst("Mayank");
        obj.addLast("kumar");
        obj.addLast("is");
        obj.addLast("best");

        obj.display();

        obj.loopLL(2);

        // System.out.println(obj.head.next.next.data);

        System.out.println("My loop contain any loop or not : " + obj.isloop());
    }

}