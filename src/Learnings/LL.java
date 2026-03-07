package Learnings;

public class LL {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    //Add First
    public void insertAtFront(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //Add Last
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            insertAtFront(data);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //Print List
    public void printList(){
        while(head != null){
            System.out.print(head.data+" -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFront(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.printList();
    }
}
