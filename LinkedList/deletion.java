package linked;

public class deletion {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    //add first code
    public void addFirst(int data){
        Node newNode = new Node(data);
        head.next = newNode;
        head = newNode;
    }

    // display
    public void display(){
        Node current = head;

        while (current != null) {
            System.out.println(current.data + " --> ");
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


     obj.display();

    }
}
