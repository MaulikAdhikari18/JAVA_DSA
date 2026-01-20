import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int [] marks = new int [size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter the number");
            marks[i] = sc.nextInt();
        }
        //int [] marks = {89,99,92};
        //marks[0] = 89;
        //marks[1] = 99;
        //marks[2] = 92;
        /*System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);*/
        for(int i = 0; i < size; i++ ){
            System.out.println(marks[i]);
        }
    }
}
