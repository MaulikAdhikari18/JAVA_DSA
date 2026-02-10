package Learnings;

import java.util.*;

public class BitManipulation {

    public void getBit(int n,int pos){//AND

        int bitMask = 1<<pos;
        if((bitMask & n) == 0){
            System.out.println("Bit was Zero");
        }else {
            System.out.println("Bit was One");
        }
    }

    public void setBit(int n,int pos){//OR
        int bitMask = 1<<pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
    public static void main(String[] args) {

        int n = 5;
        int pos = 2;
        
    }    
}
