package Learnings;

public class Recursion2 {

    //Tower Of Hanoi
    //O(2^n  - 1)
    public static void towerOfHanoi(int n,String src,String help,String dest){
        if(n == 1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, help);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, help, src, dest);
    }

    //Print a String in reverse
    public static void printReverseString(String s,int idx){
        if(idx == 0){
            System.out.println(s.charAt(idx));
            return;
        }
        System.out.print(s.charAt(idx));
        printReverseString(s, idx-1);
    }

    //First and last occurrence of a char
    public static int first = -1;
    public static int last = -1;
    public static void firstLastOccur(String str,int idx,char element){
        if(str.charAt(idx) == element){
            if(first == -1)first = idx;
            else last = idx;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        //towerOfHanoi(n, "S", "H", "D");
        String s = "Maulik";
        printReverseString(s,s.length()-1);
    }
}
