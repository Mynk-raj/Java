public class deletionAll {

    class Node {
        int data;
        Node next;

        Node(int data) {

            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addbetween(int index, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        int count = 0;

        while (count < index - 1 && current != null) {
            current = current.next;
            count++;
        }

        newNode.next = current.next;
        current.next = newNode;

    }

    // first node deletion
    public void deleteFirst() {
        if (head == null)
            return;

        head = head.next;

    }    
    
    // delete at Between in linked-list
    public void deleteBetween(int index) {

        Node current = head;
        int count = 0;

        if (head == null) {
            System.out.println("List is empty !");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        while (count < index - 1 && current != null) {
            current = current.next;
            count++;
        }

        // Check if next node exists
        if (current == null || current.next == null) {
            System.out.println("Index out of bounds!");
            return;
        }

        current.next = current.next.next;
    }

    // Delete from last
    public void deleteLast() {
        Node current = head;

        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;

    }



    // Delete for value 

    public void deleteByValue(int value){
        if(head == null){
            System.out.println("List is empty !");
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if(current.next.data == value){
                current.next = current.next.next;
                return;
            }else{
                current = current.next;
            }
        }


    }

    // searching code in linked list 
    public boolean search(int search){
        Node current = head;

        if(current == null){
            System.out.println("List is empty !");
            return false;
        }
 

        while (current != null) {
            if(current.data == search){
                return true;
            }
                current = current.next;
            
        }


        return false;
    }


    // code for checking length of linked list 
    public int length(){

        Node current = head;
           int count = 0;

        if(current == null){
            return count;

        }
     
        while(current != null){
            count++;
            current = current.next;
        }
        

        return count;
    }

    // display
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("null");
    }


    // reversing the linked list 
    public void reverse(){
        Node prev = null;
        Node current = head;

        if (current == null) {
            System.out.println("list is empty !");
            return;
        }

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            
            prev = current;
            current = next;
        }

        head = prev;

    }


    public static void main(String[] args) {

        deletionAll obj = new deletionAll();

        obj.addbetween(1, 22);
        obj.addbetween(1, 12);
        obj.addbetween(2, 42);
        obj.addbetween(2, 82);
        obj.addbetween(2, 4);
        obj.addbetween(4, 52);
        obj.addbetween(1, 2);
        obj.addbetween(1, 2);

        obj.display();

        obj.deleteFirst();
        obj.deleteLast();

        obj.display();

        obj.deleteByValue(12);

        obj.display();


        obj.search(44);

    }
}
