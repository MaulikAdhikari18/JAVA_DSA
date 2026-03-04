package Learnings;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {
        //ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
       // ArrayList<Boolean> list3 = new ArrayList<>();
       
       //add elements
       list1.add(53);
       list1.add(34);
       list1.add(46);

       System.out.println(list1);

       //get element
       int element = list1.get(2);
       System.out.println(element);

       //add element in between
       list1.add(1,1);
       System.out.println(list1);

       //set element
       list1.set(2,2);
       System.out.println(list1);

       //delete element
       list1.remove(2);
       System.out.println(list1);

       //size 
       System.out.println(list1.size());

       //sorting
       Collections.sort(list1);
       System.out.println(list1);
    }
}
