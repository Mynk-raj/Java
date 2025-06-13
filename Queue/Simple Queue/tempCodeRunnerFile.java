        // Display
        public void display(){
            if(front == null){
                System.out.println("Queue is empty !");
                return;
            }

            Node current = front;
           do{
            System.out.println(current.data);
            current = current.next;
           }while(current != rear);

        }