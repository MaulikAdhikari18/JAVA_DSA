package Problems;

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

    //Power function
    public double myPow(double x, int n) {
        if(n == 0)return 1;
        if(x == 0)return 0;
         long N = n;
         if(N < 0){
            x = 1/x;
            N = -N;
         }
         double result = 1.0;

         while(N > 0){
            if ((N & 1) == 1) {
            result *= x;
        }
        x *= x;
        N /= 2;
    }
         return result;
    }

    //First Unique Character
    public int firstUniqChar(String s) {
        int len = s.length();
        outer:
        for(int i = 0;i < len;i++){
            for(int j = 0;j < len;j++){
                if(i != j && s.charAt(i) == s.charAt(j)){
                    continue outer;
                }
            }
                return i;
        }
        return -1;
    }

    //Calculate Square Root
    public int mySqrt(int x) {
        if(x < 2)return x;

        int start = 1;
        int end = x;
        int mid = -1;

        while(start <= end){
            mid = start + (end - start) / 2;

            if((long) mid * mid > (long)x)
            end = mid - 1;
            else if(mid * mid == x)
            return mid;
            else
            start = mid + 1;
        }            

        return Math.round(end);    
    }

    //Reverse Number of not more than 32Bits
    public int reverse(int x) {

    int sum = 0;

    while (x != 0) {
        int num = x % 10;
        x = x / 10;

        if (sum > Integer.MAX_VALUE / 10 ||
           (sum == Integer.MAX_VALUE / 10 && num > 7)) {
            return 0;
        }

        if (sum < Integer.MIN_VALUE / 10 ||
           (sum == Integer.MIN_VALUE / 10 && num < -8)) {
            return 0;
        }

        sum = sum * 10 + num;
    }

    return sum;
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
    }
}
