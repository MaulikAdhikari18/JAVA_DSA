package Learnings;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<>();

        //Insert - add
        set.add(1);
        set.add(2);
        set.add(3);

        //Search - contains
        if(set.contains(1))
            System.out.println("Set contains 1");
        if(!set.contains(6))
            System.out.println("Set does not contain 6");

        //Delete - remove
        set.remove(2);

        //Size
        System.out.println("Size of set is: "+set.size());

        //Print all Elements
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
