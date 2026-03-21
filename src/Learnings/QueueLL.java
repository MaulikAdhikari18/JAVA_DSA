package Learnings;

public class QueueLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        //Enqueue
        public static void add(int data){
            Node newNode = new Node(data);
            if(tail == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = tail.next;
        } 

        //Dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }

            int data = head.data;
            if(head == tail){
                head = tail = null;
                return data;
            }
            head = head.next;
            return data;
        }

        //Peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            return head.data;
        }
    }
}
