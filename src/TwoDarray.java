import java.util.*;
public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] room = new int [3][4];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Enter the room number of floor "+ (i+1));
                room[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(room[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
