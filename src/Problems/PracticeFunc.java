package Problems;

import java.util.*;
public class PracticeFunc {
    public static void avg(int a, int b, int c){
        float avg = (a+b+c)/3;
        System.out.println("Average of the number is: "+ avg);
    }
    public static void printSumOdd(int n){
        int sum = 0;
        for(int i = 1;i <= n;i += 2){
            sum += i;
        }
        System.out.println("Sum of all odd numbers: "+sum);
    }
    public static int fibo(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public static void printFibo(int n){
        for(int i = 1;i <= n;i++){
            System.out.println(fibo(i));
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range: ");
        int n = sc.nextInt();
        printSumOdd(n);
        printFibo(n);
    }
}
