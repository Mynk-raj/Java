// package Stack;

public class prime {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    class StackLinkedList {

        public void push(int data) {
            // your code

            Node newNode = new Node(data);

            newNode.next = head;
            head = newNode;

        }

        public int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int value = head.data;
            head = head.next;
            return value;
        }

        public int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

        public boolean isEmpty() {
            // your code
            return (head == null) ? true : false;
        }

        public void printStack() {
            // your code
            Node current = head;

            if (current == null) {
                System.out.println("Stack is empty : -1");
                return;
            }

            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }

        }

    }

    public static void main(String[] args) {

        prime a = new prime();

        StackLinkedList obj = a.new StackLinkedList();

        obj.push(44);
        obj.push(23);
        obj.push(11);
        obj.push(63);
        obj.push(16);

        obj.printStack();

    }
}