package Learnings;
public class Recursion {

    public static void printNum(int n){
        if(n == 0)
            return;
        printNum(n-1);
        System.out.println(n);
    }

    public static int naturalSum(int n){
        if(n == 0)return 0;
        return n + naturalSum(n-1);
    }

    public static int factorial(int n){
        if(n == 0 || n == 1)return 1;
        return factorial(n-1)*n;
    }

    public static int fibo(int n){
        if(n == 1)return 0;
        if(n == 2 || n == 3)return 1;
        return fibo(n-1) + fibo(n-2);
    }

    public static void printFibo(int n){
        for(int i = 1;i <= n;i++){
            System.out.print(fibo(i)+" ");
        }
    }

    public static int power(int x,int n){
        if(x == 0)return 0;
        if(n == 0)return 1;
        if(n == 1)return x;
        return power(x,n-1) * x;
    } 

    //Optimized Power
    public static int powerLogn(int x,int n){
        if(x == 0)return 0;
        if(n == 0)return 1;
        if(n == 1)return x;
        if(n%2 == 0)return power(x,n/2) * power(x,n/2);
        return power(x,n/2)*power(x,n/2)*x;
    }

    public static void main(String[] args) {
        int n = 5;
        //printNum(n);
        //System.out.println(naturalSum(n));
        //System.out.println(factorial(n));
        //printFibo(8);
        System.out.println(powerLogn(2,5));
    }
}
