public class Queue {
    class Node{
        int data;
        Node next;

        //Constructor
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    //Enqueue Function
    void enqueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = newNode;
            rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
    }
    
    //Dequeue function
    int dequeue(){
        int val;
        if(front == null){
            System.out.println("Queue Underflow Nothing to deque");
            return -1;
        }
        if(front == rear){
            System.out.println("Queue empty");
            val = front.data;
            front = null;
            rear = null;
            return val;
        }
        val = front.data;
        front = front.next;
        return val;
    }

    //Print Queue
    void printQ(){
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Main Function
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(10);
        q.enqueue(20);
        q.printQ();
        q.dequeue();
        q.dequeue();
        q.printQ();
        q.dequeue();
        q.printQ();
    }
}
