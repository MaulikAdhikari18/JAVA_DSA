package Learnings;

public class QueueArray {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        //Enqueue
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Full Queue");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        //Dequeue  O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0;i < rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        //Peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            return arr[0];
        }
    }
}
