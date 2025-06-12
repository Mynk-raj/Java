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
         return newNode;
       }

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        return head;

    }

    // public void display(){
    //     Node current1 = head1;
    //     Node current2 = head2;

    //     if(current1 == null){
    //         System.out.println("List is empty !");
    //         return;
    //     }

    //     while(current1 != null){
    //         System.out.print(current1.data + " -->  ");
    //         current1 = current1.next;
    //     }

    //     System.out.println();

    //     if(current2 == null){
    //        System.out.println("List is empty !");
    //         return;  
    //     }

    //     while (current2 != null) {
    //         System.out.print(current2.data + "  -->  ");
    //         current2 = current2.next;
    //     }  
    // }



public void display() {
    Node current1 = head1;
    Node current2 = head2;

    System.out.print("List 1: ");
    if (current1 == null) {
        System.out.println("Empty!");
    } else {
        while (current1 != null) {
            System.out.print(current1.data + " --> ");
            current1 = current1.next;
        }
        System.out.println("null");
    }

    System.out.print("List 2: ");
    if (current2 == null) {
        System.out.println("Empty!");
    } else {
        while (current2 != null) {
            System.out.print(current2.data + " --> ");
            current2 = current2.next;
        }
        System.out.println("null");
    }
}




    // <----------------------------------code for mergig two sorted linked list-----------------------> 

    public Node merge(Node head1, Node head2){
        if(head1 == null) return head2;
        if(head2 == null) return head1;

        Node current1 = head1;
        Node current2 = head2;

        if(current1.data < current2.data){
            current1.next = merge(current1.next, current2);
            return current1;
        }else{
            current2.next = merge(current1, current2.next);
            return current2;
        }

    }

    public void printMergedList(Node head){
        Node current = head; 
        if(head == null){
            System.out.println("List is empty !");
             return;
        }

        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        merge obj = new merge();
        
        obj.addLastNode1(1);
        obj.addLastNode1(2);
        obj.addLastNode1(3);
        obj.addLastNode1(4);
        obj.addLastNode1(5);


        obj.addLastNode2(5);
        obj.addLastNode2(6);
        obj.addLastNode2(7);
        obj.addLastNode2(8);
        obj.addLastNode2(9);


        obj.display();


         // ✅ Merge and print result
        Node mergedHead = obj.merge(obj.head1, obj.head2);
        System.out.println("Merged List:");
        obj.printMergedList(mergedHead);
        
        
    }
}
