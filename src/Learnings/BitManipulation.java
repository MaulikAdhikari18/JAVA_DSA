package Learnings;

import java.util.*;

public class BitManipulation {

    public static void getBit(int n,int pos){//AND

        int bitMask = 1<<pos;
        if((bitMask & n) == 0){
            System.out.println("Bit was Zero");
        }else {
            System.out.println("Bit was One");
        }
    }

    public static void setBit(int n,int pos){//OR
        int bitMask = 1<<pos;

        int newNumber = bitMask | n;
        System.out.println("Set Bit at position "+pos);
        System.out.println("New Number: "+newNumber);
    }

    public static void clearBit(int n,int pos){//AND with NOT
        int bitMask = 1<<pos;

        int newNumber = n & ~(bitMask);
        System.out.println("Cleared Bit at position "+pos);
        System.out.println("New Number: "+newNumber);
    }

    public static void updateBit(int n,int pos,int bit){
        if(bit == 0){
            System.out.print("Updated to 0: ");
            clearBit(n, pos);
            System.out.println("");
        }
        if(bit == 1){
            System.out.print("Updated to 1: ");
            setBit(n,pos);
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        int n = 5;
        int pos = 2;

        getBit(n,pos);
        setBit(n, 1);
        clearBit(n, pos);
        updateBit(n, pos, 1);
        updateBit(n, pos, 0);
    }    
}
