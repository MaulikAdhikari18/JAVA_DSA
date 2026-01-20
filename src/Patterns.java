import java.util.*;
public class Patterns {
    public static void rectangle(){
        for(int i = 0;i <4 ;i++){
            for(int j = 0; j <=4;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void hollowRectangle(){
        for(int i=0;i<4;i++){
            for(int j=0;j<=4;j++){
                if(i>=1 && i<3 && j>=1 && j<4){
                    System.out.print(" ");
                }
                else System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void halfPyramid(){
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void invertedHalfPyramid(){
        for(int i=4;i>0;i--){
            for(int j=i-1;j>=0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void pyramid(int n){
        for(int i = 0;i < n; i++){
            for(int j = 0;j <= i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pyramidTemple(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        //rectangle();
        //hollowRectangle();
        //halfPyramid();
        //invertedHalfPyramid();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        pyramid(n);
        pyramidTemple(n);
    }
}
