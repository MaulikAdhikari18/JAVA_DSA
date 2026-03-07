package Learnings;


import java.util.*;

public class LLFrameworks {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(); 
        list.addFirst(10);
        list.addFirst(20);
        System.out.println(list);

        list.addLast(30);
        list.addFirst(80);
        System.out.println(list);

        System.out.println("Size:"+list.size());

        for(int i = 0;i < list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("Null");
    }
}
