package Learnings;
import java.util.*;

public class Backtracking {
    
    public static void printPermutations(String str,String perm,int idx){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }

        for(int i = 0;i < str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutations(newStr, perm + currChar, idx+1);
        }
    }

    //N Queen
    public boolean isSafe(int row,int col,char[][] board){
        //Horizontal
        for(int j = 0;j < board.length;j++){
            if(board[row][j] == 'Q')return false;
        }

        //Vertical
        for(int i = 0;i < board[0].length;i++){
            if(board[i][col] == 'Q')return false;
        }

        //Upper left
        for(int c = col,r = row;c >= 0 && r >= 0;r--,c--){
            if(board[r][c] == 'Q')return false;
        }

        //Upper right
        for(int c = col,r = row;c < board.length && r >= 0;r--,c++){
            if(board[r][c] == 'Q')return false;
        }

        //Lower Left
        for(int c = col,r = row;r < board.length && c >= 0;r++,c--){
            if(board[r][c] == 'Q')return false;
        }

        //Lower Right
        for(int c = col,r = row;r < board.length && c < board.length;r++,c++){
            if(board[r][c] == 'Q')return false;
        }

        return true;
    }

    public void saveBoard(char[][] board,List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayLists<>();

        for(int i = 0;i < board.length;i++){
            row = "";
            for(int j = 0;j < board[0].length;j++){
                if(board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public void helper(char[][] board,List<List<String>> allBoards,int col){
        if(col == board.length){
            saveBoard(board,allBoards);
            return;
        }
        for(int row = 0;row < board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayLists<>();
        char [][] board = new char[n][n];

        helper(board,allBoards,0);
        return allBoards;
    }

    //Sudoku Solver
    public static boolean isSafe(char[][] board,int row,int col,int number){
        //row & column
        for(int i = 0;i < board.length;i++){
            if(board[i][col] == (char)(number + '0')){
                return false;
            }
            if(board[row][i] == (char)(number + '0')){
                return false;
            }
        }

        //Grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;

        for(int i = sr;i < sr+3;i++){
            for(int j = sc;j < sc+3;j++){
                if(board[i][j] == (char)(number + '0')){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean helper(char[][] board,int row,int col){
        if(row == board.length){
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if(col != board.length - 1){
            nrow = row;
            ncol = col + 1;
        }else{
            nrow = row + 1;
            ncol = 0;
        }

        if(board[row][col] != '.'){
            if(helper(board,nrow,ncol)){
                return true;
            }
        }else {
            for(int i = 1;i <= 9;i++){
                if(isSafe(board,row,col,i)){
                    board[row][col] = (char)(i+'0');
                    if(helper(board,nrow,ncol)){
                        return true;
                    }else{
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }

    public static void solveSudoku(char[][] board){
        helper(board,0,0);
    }

    public static void main(String[] args) {
        
        //String str = "ABC";
        //printPermutations(str, "", 0);
        
    }
}
