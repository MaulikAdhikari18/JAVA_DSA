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
    void insertEnd(int data){
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

    //Insert at Front
    Node insertFront(int data){
        Node newNode = new Node(data);

        //if list is empty
        if(head == null)
            return newNode;

        //if list is not empty
        newNode.next = head;
        return newNode;
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
    //Remove elements from the list

    public Node removeElements(Node head, int data) {
        if(head == null) return null;
        if(head.data == data){
            while(head.next != null && head.next.data == data){    
                head = head.next;
            }
            head = head.next;
        }
        if(head == null)return null;
        
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == data){
                temp.next = temp.next.next;
            }else
            temp = temp.next;
        }
        return head;
    }

    //Add two Numbers

    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node curr = dummy;
        int carry = 0;

        while(l1 != null || l2!= null || carry != 0){
            int sum = carry;
             if(l1 != null){
                sum += l1.data;
                l1 = l1.next;
             }

             if(l2 != null){
                sum += l2.data;
                l2 = l2.next;
             }

             carry = sum/10;
             curr.next = new Node(sum%10);
             curr = curr.next;
        }
        return dummy.next;
}
}




//main
public class linkedList{
    public static void main(String[] args) {
        lList list = new lList();

        list.insertEnd(10);
        list.insertEnd(30);
        list.insertEnd(40);

        list.printList();
    }
}