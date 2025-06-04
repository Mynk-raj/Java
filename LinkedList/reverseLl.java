public class reverseLl {

    // creating Node class for linked list in java
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // add fist program
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // code for displaying linked list
    public void display() {
        Node current = head;

        if (current == null)
            System.out.println("Linked list is empty !");

        while (current != null) {
            System.out.print(current.data + "  ---->  ");
            current = current.next;
        }
        System.out.println("null");

    }

    // code for reversing Linked list
    public void reverse() {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }

        head = prev;

    }

    public void rotate(){
        Node current = head;
        Node prev = null;
      
        while(current != null){
            Node next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }

        head = prev;
    }


    public static void main(String[] args) {
        reverseLl obj = new reverseLl();

        obj.addFirst(4);
        obj.addFirst(15);
        obj.addFirst(11);
        obj.addFirst(78);
        obj.addFirst(25);
        obj.addFirst(96);
        obj.addFirst(45);
        obj.addFirst(34);

        obj.display();

        obj.reverse();

        obj.display();

        obj.reverse();

        obj.display();

        System.out.println("After rotation : ");
        obj.rotate();

        obj.display();

    }
}