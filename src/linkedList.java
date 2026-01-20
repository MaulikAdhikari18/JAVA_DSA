import java.util.*;

class Node{
    int data;
    Node next;

    //Constructor
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class lList{
    Node head; //first node of the list

    //Insert at end
    void insert(int data){
        Node newNode = new Node(data);

        //if list is empty
        if(head == null){
            head = newNode;
            return;
        }

        //if list not empty
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //print list
    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //Detect cycle in linked list
    public boolean hasCycle(Node head) {
        if(head == null)return false;
        Node temp1 = head;
        Node temp2 = head;
        while(temp2 != null && temp2.next != null){
            temp1 = temp1.next;
            temp2 = temp2.next.next;
            if(temp1 == temp2)
            return true;
        }
        return false;
    }
    
    //Find intersection point of two linked lists
    public Node getIntersectionNode(Node headA, Node headB) {
        if(headA == null || headB == null)return null;
        Node pA = headA;
        Node pB = headB;

        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }

        return pA;
    }
}




//main
public class linkedList{
    public static void main(String[] args) {
        lList list = new lList();

        list.insert(10);
        list.insert(30);
        list.insert(40);

        list.printList();
    }
}