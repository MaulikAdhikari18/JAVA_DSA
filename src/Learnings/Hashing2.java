package Learnings;

import java.util.*;

public class Hashing2 {
    
    public static void main(String[] args) {
        
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion
        map.put("India",120);
        map.put("England",100);
        map.put("Australia",80);

        System.out.println(map);

        map.put("Australia", 20);
        System.out.println(map);
    }
}
