package Problems;

import java.util.*;

public class First{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your SAP ID: ");
        String st = sc.nextLine();
        System.out.println("SAP ID is: " + st);
        System.out.print("Enter a Decimal Number: ");
        Double d = sc.nextDouble();
        System.out.print("Enter an Integer: ");
        int i = sc.nextInt();
        System.out.println("Decimal Number is: "+d);
        System.out.println("Integer Number is: "+i);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        System.out.println("Character is: "+c);
        boolean b = true;
        System.out.print("Enter a Float: ");
        float a = sc.nextFloat();
        System.out.println("Float: "+a);
        System.out.println(st.getClass().getName());
    }
}
