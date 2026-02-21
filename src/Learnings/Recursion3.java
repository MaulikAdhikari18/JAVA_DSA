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
        int rightPath = countPaths(i, j+1, n, m);
        return downPath + rightPath;
    }

    //Place Tiles
    //Tile size 1Xm
    public static int placeTiles(int n,int m){
        if(n == m)return 2;
        if(n < m)return 1;

        //vertically
        int verTiles = placeTiles(n-m, m);

        //horizontally
        int horTiles = placeTiles(n-1, m);

        return verTiles + horTiles;
    }

    //Invite Guests
    public static int inviteGuests(int n){
        if(n <= 1)return 1;

        //Single
        int singleGuest = inviteGuests(n-1);

        //Pair
        int pairGuest = (n-1) * inviteGuests(n-2);

        return singleGuest + pairGuest;
    }

    public static void main(String[] args) {
        //String str = "abc";
        //printPerm(str, "");
        int n = 5;
        int m = 2;
       //int totalPaths = countPaths(0, 0, n, m);
       //int totalWays = placeTiles(n, m);
       System.out.println(inviteGuests(n));
    }
}

