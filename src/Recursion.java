public class Recursion {

    //Power of two
    public static boolean isPowerOfTwo(int n) {
        if(n == 1)return true;
        if(n <= 0)return false;
        if(n%2 != 0) return false;
        return isPowerOfTwo(n/2);
    }

    //Fibonacci series
    public static int fibo(int n){
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        return fibo(n-1) + fibo(n-2);
    }

    //Print Fibonacci series
    public static void printFibo(int n){
        for(int i = 1;i <= n;i++){
            System.out.println(fibo(i));
        }
    }

}
