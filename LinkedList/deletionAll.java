public class deletionAll {

    class Node{
        int data;
        Node next; 

        Node(int data){

            this.data = data;
            this.next = null;
        }
    }

    Node head;
    
    
    public void addbetween(int index, int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        int count = 0;

        while(count < index -1 && current != null){
            current = current.next; 
            count++;
        }
        
        newNode.next = current.next;
        current.next = newNode;
  
    }

    // first node deletion
    public void deleteFirst(){
        if(head == null)
         return;

        head = head.next;

    }

    // delete at specific location

    public void deleteBetween(int index){
        
        Node current = head;
        int count = 0;

        while(count < index-1 && current != null){
            current = current.next;
            count++;
        }
        

        current.next = current.next.next;
    }


    // Delete from last 

    public void deleteLast(){
        Node current = head;

        while(current.next.next != null){
            current = current.next;
        }

        current.next = null;

    }



    // display 
    public void display(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("null");
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

        obj.display();

        obj.deleteFirst();
        obj.deleteLast();

        obj.display();
    }
}
