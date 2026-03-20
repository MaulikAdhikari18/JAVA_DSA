package Learnings;

public class StackClass {
    static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        static Node head;
        public static boolean isEmpty(){
            return head == null;
        }

        //Push
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //Pop
        public static int pop(){
            if(isEmpty())return -1;
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty())return -1;
            return head.data;
        }
    }
}
