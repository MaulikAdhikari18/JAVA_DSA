import java.util.*;
public class Functions {
    public static void printName(String name){
        System.out.println(name);
        return;
    }
    public static int addNum(int a,int b){
        return a+b;
    }
    public static void loopFact(int a){
        if(a<0){
            System.out.println("Invalid number");
            return;
        }
        if(a == 0){
            System.out.println("Factorial is 0");
            return;
        }
        int factorial = 1;
        while(a>0){
            factorial *= a;
            a--;
        }
        System.out.println("Factorial of the number is: " + factorial);
        return;
    }
    public static float average(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        float average = (a+b+c)/3;
        System.out.println("Average of the three numbers:" + average);
        return 0;
    }
    public static int fibo(int n){
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        return fibo(n-1) + fibo(n-2);
    }

    public static void printFibo(int n){
        for(int i = 1;i <= n;i++){
            System.out.println(fibo(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        //String n = sc.nextLine();
        //printName(n);
        int b = sc.nextInt();
        System.out.println("Addition of two numbers: "+ addNum(a,b));
        System.out.print("Enter number for factorial: ");
        int f = sc.nextInt();
        loopFact(f);
        average();
        printFibo(a);
    }
}
