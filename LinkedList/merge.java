public class merge {


    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head1;
    private Node head2;

    public void addLastNode1(int data){
         head1 = addLast(head1, data);
    }

    public void addLastNode2(int data){
        head2 = addLast(head2, data);
    }


    private Node addLast(Node head, int data){
        Node newNode = new Node(data);

        Node current = head;
       if(head == null){
        head = newNode;
       }

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        return head;


    }


    public static void main(String[] args) {
        merge obj = new merge();
        
        obj.addLastNode1(44);
    }
}
