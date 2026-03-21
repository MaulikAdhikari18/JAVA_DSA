package Learnings;

public class CircularQueueArray {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return rear == front && front != -1;
        }

        //Enqueue
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue Full");
                return;
            }

            if(front == -1)front = 0;

            rear = (rear+1)%size;
            arr[rear] = data;
        }

        //Dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }

            int data = arr[front];
            if(front == rear){
                front = -1;
                rear = -1;
                return data;
            }
            front = (front+1) % size;
            return data;
        }

        //Peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            return arr[front];
        }
    }
    
}
