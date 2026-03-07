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
    private int size;

    LL(){
        this.size = 0;
    }

    //Add First
    public void insertAtFront(int data){
        Node newNode = new Node(data);
        size++;
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
        size++;
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

    //Delete First
    public void deleteFirst(){
        if(head == null)return;
        size--;
        head = head.next;
    }

    //Delete Last
    public void deleteLast(){
        if(head == null)return;
        size--;
        Node prev = null;
        Node curr = head;
        if(head.next == null){
            head = null;
            return;
        }
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
    }

    //Print List
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Length of LL
    public int getSize(){
        return size;
    }
    
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFront(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.printList();
        System.out.println("Size: "+list.getSize());

        list.deleteLast();
        list.printList();
        System.out.println("Size: "+list.getSize());

        list.insertAtFront(90);
        list.printList();
        System.out.println("Size: "+list.getSize());
    }
}
