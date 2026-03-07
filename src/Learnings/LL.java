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

    //Add First
    public void insertAtFront(Node head,int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //Add Last
    public void insertAtEnd(Node head,int data){
        Node newNode = new Node(data);
        if(head == null){
            insertAtFront(head, data);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    public static void main(String[] args) {
        LL list = new LL();
    }
}
