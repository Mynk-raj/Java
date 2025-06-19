// package Queue.Circular Queue;

public class queueArray {

    // Implementing circular Queue using array

    public class queue {

        private int front;
        private int rear;
        private int arr[];
        private int capacity;

        // Implementation
        public void implementation(int size) {
            this.arr = new int[size];
            front = -1;
            rear = -1;
            capacity = size;
        }

        public void enqueue(int data) {
            // Check if queue is full
            if ((rear + 1) % capacity == front) {
                System.out.println("Queue is full!");
                return;
            }

            // First element insertion
            if (front == -1) {
                front = 0;
            }

            // Move rear and insert
            rear = (rear + 1) % capacity;
            arr[rear] = data;
        }



        public void dequeue() {
            if (front == -1) {
                System.out.println("Queue is empty!");
                return;
            }

            // If the queue has only one element
            if (front == rear) {
                System.out.println("Removed element: " + arr[front]);
                front = -1;
                rear = -1;
            } else {
                System.out.println("Removed element: " + arr[front]);
                front = (front + 1) % capacity;
            }
        }

        // Display
        public void display() {
            if (front == -1) {
                System.out.println("Queue is empty!");
                return;
            }

            System.out.print("Queue: ");
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");

                if (i == rear) {
                    break;
                }

                i = (i + 1) % capacity;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        queueArray a = new queueArray();
        queue obj = a.new queue();

        obj.implementation(10);

        obj.enqueue(44);
        obj.enqueue(55);
        obj.enqueue(66);
        obj.enqueue(77);
        obj.enqueue(88);
        obj.dequeue();
        obj.display();


    }
}
