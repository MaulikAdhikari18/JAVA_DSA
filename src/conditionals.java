import java.util.*;
public class conditionals {
    public static void main(String[] args) {
        System.out.print("Enter your SAP ID: ");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2 == 0){
            System.out.println(n+" is an even number");
        }
        else System.out.println(n+" is an odd number");
        for(int i = 0; i <= 10;i++ ) {
            if (i % 2 == 0) {
                System.out.println("Go to HELL");
            } else System.out.println("Go to Heaven");
        }

    }
}
