// package Queue;

import java.util.Deque;

public class arrayQueue {

    public class queueclass {
        private int arr[];
        private int front;
        private int rear;
        private int capacity;

        // ✅ Proper constructor
        public queueclass(int size) {
            front = 0;
            rear = -1;
            capacity = size;
            arr = new int[size]; // ✅ Now arr is initialized
        }

        public void enqueue(int data) {
            if (rear == capacity - 1) {
                System.out.println("Queue is full !");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        // Deque operationn 
        public void dequeue() {
            if (front > rear) {
                System.out.println("Queue is empty!");
                return;
            }

            System.out.println("Dequeued element: " + arr[front]);
            front++;
        }

        // isEmpty 
        public boolean isEmpty(){
            if(rear < front){
                System.out.println("Queue is empty");
                return true;
            }

            return false;
        }

        // Is full
        public boolean isFull(){
            if(rear == capacity -1){
                System.out.println("Queue is full : ");
                return true; 
            }
            return false;
        }

        // peak
        public int peak(){
            if(rear < front){
                System.out.println("Queue is empty : ");
                return -1;
            }
            return arr[front];
        }


        // Display 
        public void display() {
            if (rear < front) {
                System.out.println("Queue is empty !");
                return;
            }

            System.out.print("Queue : ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        arrayQueue a = new arrayQueue();
        queueclass obj = a.new queueclass(10); // ✅ Now passing size to constructor

        obj.enqueue(11);
        obj.enqueue(4);
        obj.enqueue(23);
        obj.enqueue(44);

        obj.display();

        obj.dequeue();

        obj.display();
    }
}
