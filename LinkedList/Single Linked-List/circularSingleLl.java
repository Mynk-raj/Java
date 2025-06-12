public class circularSingleLl {
    // Declaring Node in Java
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = head;
        }
    }

    // Declaring head in Linked List
    Node head;

    // Add first code in linked Listt
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Code for add between in Linked List in java
    public void addBetween(int index, int data) {
        Node newNode = new Node(data);
        Node current = head;
        int count = 0;

        while (count < index - 1 && current != null) {
            count++;
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

    }

    // Code for add last node in Linked List in java
    public void addLast(int data) {
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
    }

     // <---------  Lets start Deletion in Linked List       -------------->

     //Delete from First 
     public void deleteFirst(){
        if(head == null) return;
        head = head.next;
     }



    // Code for displaying Linked List in java
    public void display() {
        if (head == null) {
            System.out.println("Linked List is empty !");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        System.out.println("Jai shree Ram !!");
        circularSingleLl obj = new circularSingleLl();

        obj.addFirst(7);
        obj.addFirst(4);
        obj.addFirst(8);
        obj.addFirst(2);
        obj.addFirst(10);

        obj.display();

        obj.addLast(55);
        obj.addLast(22);

        obj.display();

        // obj.addBetween(2, 12);

        // obj.display();

        // obj.deleteFirst();

        // obj.display();

    }
}
