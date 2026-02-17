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
        if(idx == str.length())return;
        if(str.charAt(idx) == element){
            if(first == -1)first = idx;
            else last = idx;
        }
        firstLastOccur(str, idx+1, element);
    }

    //Check strictly increasing order
    public static boolean isIncreasing(int []arr,int idx){
        if(idx == arr.length-1)return true;
        if(arr[idx] < arr[idx+1])return isIncreasing(arr, idx+1);
        return false;
    }

    //Move all 'x' to the end of the string
    public static void moveX(String str,int idx,int count,String newS){
        if(idx == str.length()){
            for(int i = 0;i < count;i++){
                newS += 'x';
            }
            System.out.println(newS);
            return;
        }
        if(str.charAt(idx) == 'x' || str.charAt(idx) == 'X'){
            moveX(str, idx+1, count+1, newS);
        }else{
            newS += str.charAt(idx);
            moveX(str, idx+1, count, newS);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        //towerOfHanoi(n, "S", "H", "D");
        String s = "xaxbcdefgxhxi";
        //printReverseString(s,s.length()-1);
        // firstLastOccur(s, 0,'a' );
        // System.out.println("First index: "+first);
        // System.out.println("Last index: "+last);
        moveX(s, 0, 0, "");
    }
}
