public class Recursion {

    //Power of two
    public static boolean isPowerOfTwo(int n) {
        if(n == 1)return true;
        if(n <= 0)return false;
        if(n%2 != 0) return false;
        return isPowerOfTwo(n/2);
    }

    //Power of Three
    public boolean isPowerOfThree(int n) {
        if(n == 1)return true;
        if(n <= 0)return false;
        if(n%3 != 0)return false;
        return isPowerOfThree(n/3);
    }

    //Power of Four
    public boolean isPowerOfFour(int n) {
        if(n == 1)return true;
        if(n <= 0)return false;
        if(n%4 != 0)return false;
        return isPowerOfFour(n/4);
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

    //Print number of Ones
    public int countDigitOne(int n) {
        if(n <= 0)return 0;

        String s = String.valueOf(n);
        int len = s.length();
        int firstDigit = s.charAt(0) - '0';
        int power = (int) Math.pow(10, len - 1);
        int rest = n - firstDigit * power;

        if (firstDigit == 1) {
            return countDigitOne(power - 1) + rest + 1 + countDigitOne(rest);
        } else {
                return firstDigit * countDigitOne(power - 1) + power + countDigitOne(rest);
            }
    }

}
