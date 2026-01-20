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