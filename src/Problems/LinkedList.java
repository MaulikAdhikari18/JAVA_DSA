package Problems;

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

//Remove Duplicates II
public Node deleteDuplicates(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node curr = head;
        while(curr != null){
            while(curr.next != null && curr.data == curr.next.data){
                curr = curr.next;
            }
            if(prev.next == curr){
                prev = prev.next;
            }else{
                prev.next = curr.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

//Palindrome LinkedList
public boolean isPalindrome(Node head) {
        if(head.next == null)return true;
        int count = countNodes(head);
        Node temp = head;
        Node revLL = null;
        for(int i = 0;i < count/2;i++){
            Node newNode = new Node(temp.data);
            newNode.next = revLL;
            revLL = newNode;
            temp = temp.next;
        }
        if (count % 2 == 1) {
            temp = temp.next;
        }
        
        while(revLL != null){
            if(revLL.data != temp.data)return false;
            revLL = revLL.next;
            temp = temp.next;
        }
        return true;
    }

    private int countNodes(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    
//Palindrome LinkedList Optimal
public boolean isPalindromeOpt(Node head) {
    if (head == null || head.next == null) return true;

    // Find middle
    Node slow = head, fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    // Reverse second half
    Node prev = null;
    while (slow != null) {
        Node next = slow.next;
        slow.next = prev;
        prev = slow;
        slow = next;
    }

    // Compare halves
    Node left = head;
    Node right = prev;

    while (right != null) {
        if (left.data != right.data) return false;
        left = left.next;
        right = right.next;
    }

    return true;
}

}




//main
public class LinkedList{
    public static void main(String[] args) {
        lList list = new lList();

        list.insertEnd(10);
        list.insertEnd(30);
        list.insertEnd(40);

        list.printList();
    }
}