// package Queue.Simple Queue;

public class linkedListQueue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class queue {
        private Node front;
        private Node rear;

        // Adding element in Queue
        public void enqueue(int data) {

            Node newNode = new Node(data);

            if (front == null) {
                front = newNode;
                rear = newNode;

            } else {

                rear.next = newNode;
                rear = newNode;

            }

        }

        // Dequew : removing element from fornt
        public void dequeue() {
            if (front == null) {
                System.out.println("Queue is empty !");
                return;
            } 
            front = front.next;

            if (front == null) {
                rear = null;
            }
        }

        // isEmpty
        public boolean isEmpty(){
            if(front == null){
                System.out.println("Queue is empty !");
                return true;
            }

            return false;
        }

        //peek 
        public int peek(){
            if(front == null){
                System.out.println("Queue is empty : ");
                return -1;
            }

            return front.data;
        }


        // Display
        public void display() {
            if (front == null) {
                System.out.println("Queue is empty !");
                return;
            }

            Node current = front;
            // do {
            // System.out.println(current.data);
            // current = current.next;
            // } while (current != null);

            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }

        }

    }

    public static void main(String[] args) {
        System.out.println("Jai Shree Ram ");

        linkedListQueue a = new linkedListQueue();
        queue obj = a.new queue();

        obj.enqueue(44);
        obj.enqueue(25);
        obj.enqueue(36);
        obj.enqueue(15);

        obj.display();
    }
}
