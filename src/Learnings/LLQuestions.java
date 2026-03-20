package Learnings;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    //Delete Nth Node from End
    public Node deleteNthFromEnd(int n,Node head){
        if(head.next == null)return null;
        int length = countNodes(head);
        if(n == length){
            head = head.next;
            return head;
        }
        Node temp = head;
        for(int i = 1;i < length-n;i++){
            temp = temp.next;
        }
        if(n == 1){
            temp.next = null;
            return head;
        }
        temp.next = temp.next.next;
        return head;
    }

    //Count Nodes
    public int countNodes(Node head){
        if(head == null)return 0;
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
}

public class LLQuestions {
    
}
