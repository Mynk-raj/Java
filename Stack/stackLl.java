package Stack;

public class stackLl {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class stackLL {
        public static Node head;

        // function for checking empty stack
        public static boolean isempty() {
            return head == null;
        }

        // Now push function for stack
        public static void push(int data) {
            Node newNode = new Node(data);

            if (isempty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        
        }
   
        // Now doing pop operation on stack 
        public static void pop(){
            if(isempty()){
                System.out.println("Stack is empty");
                return;
            }

            head = head.next;

        }
   

        // Now doing peek operation on stack basicaly returning top element on stack
        public static int peek(){
            if(isempty()){
                System.out.println("Stack is empty : ");
                return -1;
            }

            return head.data;
        }

        // Now printing stack
        public static void print(){
            Node current = head;

            if(isempty()){
                System.out.println("Empty stack !");
                return;
            }

            System.out.println("Stack from top to bottom : ");

            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }

    }

    public static void main(String[] args) {
        // Note : Stack can implemented mainly two methods : Array and Linklist

        stackLL s = new stackLL();

        s.push(2);
        s.push(4);
        s.push(8);
        s.push(1);
        s.push(3);
        s.push(11);

        s.print();

        s.pop();

        s.print();

    }
}
