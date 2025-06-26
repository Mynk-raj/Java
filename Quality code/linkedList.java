class linkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class LL {

        private static Node head;

        // Add first program in single linked list
        public static void addFirst(int data) {

            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;

        }

        // Add node with idx
        public static void addByIndex(int idx, int data) {
            if (head == null) {
                System.out.println("list is empty.");
                return;
            }

            Node newNode = new Node(data);
            if (idx == 0) {
                newNode.next = head;
                head = newNode;
            }

            Node current = head;
            for (int i = 0; i < idx - 1; i++) {
                if (current == null || current.next == null) {
                    System.out.println("Index out of bond");
                    return;
                }
                current = current.next;
            }

            // current.next = newNode;
            // current = newNode;
            newNode.next = current.next;
            current.next = newNode;

        }

        // Add last program in single linked list
        public static void addLast(int data) {
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

        // Delete form head
        public static void deleteFirst() {
            if (head == null) {
                System.out.println("list is empty.");
                return;
            }

            head = head.next;

        }

        // Delete form tail
        public static void deleteTail() {
            if (head == null) {
                System.out.println("list is empty");
                return;
            }

            Node current = head;

            if (head.next == null) {
                head = null;
                return;
            }

            while (current.next.next != null) {
                current = current.next;
            }

            current.next = null;
        }

        // Delete by value
        public static void deleteByValue(int val) {
            if (head.data == val) {
                head = head.next;
                return;
            }

            Node current = head;
            while (current.next != null) {
                if (current.next.data == val) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }

        }

        // Delete by index
        public void deleteByIndex(int idx) {
            if (head == null) {
                System.out.println("list is empty");
                return;
            }
            if (idx == 0) {
                head = head.next;
                return;
            }

            Node current = head;

            for (int i = 0; i < idx - 1; i++) {
                if (current == null || current.next == null) {
                    System.out.println("Index out of bounds exception");
                    return;
                }
                current = current.next;
            }

            current.next = current.next.next;

        }

        // Display
        public static void display() {
            Node current = head;
            if (current == null) {
                System.out.println("list is empty !");
                return;
            }

            while (current != null) {
                System.out.print(current.data + " --> ");
                current = current.next;
            }

            System.out.println("null");

        }

        // Reverse
        public static void reverse() {
            Node prev = null;
            Node current = head;

            if (head == null) {
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

        // Search
        public static boolean search(int key) {

            Node current = head;

            while (current != null) {
                if (current.data == key) {
                    return true;
                } else {
                    current = current.next;
                }

            }

            return false;
        }

        // Length
        public static int length() {
            if (head == null) {
                return 0;
            }

            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }

            return count;
        }

        // some advance question of linked list 
        public static boolean palindrome(){

            if(head == null || head.next == null){
                return true;
            }

            


            return true;
        }

        // find middle
        public static Node middle(){

           Node slow = head;
           Node fast = head;
           int count = 0;

           Node current = head;
           while (current.next != null || current.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            count++;
           }

           return slow;
        }

    }

    public static void main(String[] args) {

        linkedList a = new linkedList();
        LL obj = a.new LL();

        obj.addFirst(44);
        obj.display();
        obj.addLast(22);
        obj.addLast(42);
        obj.addLast(52);


        obj.display();

        obj.deleteTail();

        obj.display();

        obj.search(22);

        System.out.println("length of linked list is : " + obj.length());

        obj.deleteByIndex(3);

   
        // System.out.println(obj.deleteByIndex(2));

        // obj.addByIndex(1, 15);
    }
}