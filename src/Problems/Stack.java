package Problems;

public class Stack{
    class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node top;

    //Push Function
    void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    //Pop Function
    int pop(){
        if(top == null){
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    //Peek Function
    int peek(){
        if(top == null) return -1;
        return top.data;
    }

    public static void main(String[] args){
    Stack stack = new Stack();

    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);

    System.out.println("Peek at top: "+stack.peek());
    System.out.println("Pop 1: "+stack.pop());
    System.out.println("Pop 2: "+stack.pop());
    System.out.println("Pop 3: "+stack.pop());
    System.out.println("Peek at top: "+stack.peek());

    }
}


