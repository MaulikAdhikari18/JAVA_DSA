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

        //Search
        // if(map.containsKey("England")){
        //     System.out.println("Key is present in the map");
        // }else{
        //     System.out.println("Key is not present in the map");
        // }

        // System.out.println(map.get("India")); //key exists
        // System.out.println(map.get("New Zealand"));//key doesn't exist

        // int []arr = {12, 67, 89};
        // for(int i=0;i<3;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        // for(int val : arr){
        //     System.out.print(val + " ");
        // }
        // System.out.println();

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" : ");
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " "+map.get(key));
        }

        //Remove
        map.remove("Australia");
    }
}
