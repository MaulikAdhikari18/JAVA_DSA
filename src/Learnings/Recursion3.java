package Learnings;

public class Recursion3 {
    public static void printPerm(String str,String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i = 0;i < str.length();i++){
            char currChar = str.charAt(i);

            String newStr = str.substring(0,i) + str.substring(i+1);
            printPerm(newStr, permutation+currChar);
        }
    }

    //Count Paths
    public static int countPaths(int i,int j, int n,int m){
        if(i == n || j == m)return 0;
        if(i == n-1 && j == m-1)return 1;

        //move downwards
        int downPath = countPaths(i+1, j, n, m);

        //move right
        int rightPath = countPaths(i, j+1, downPath, m);
        return downPath + rightPath;
    }

    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");
    }
}
