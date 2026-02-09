import java.util.*;
public class numberTheory{

    //Add digits
    public int addDigits(int num) {
        if(num == 0)return 0;
        int digit;
        int sum = 0;
        while(num != 0){
            digit = num%10;
            sum = sum + digit;
            num /= 10;
        }
        if(sum/10 != 0)
        return addDigits(sum);
        return sum;
    }

    //Count Primes
    public static int countPrimes(int n) {
        if(n == 0 || n == 1)return 0;
        if(n%2 == 0)return 0 + countPrimes(n-1);
        for(int i = 2;i < n;i++){
            if(n%i == 0)return 0 + countPrimes(n-1);
        }
        return 1 + countPrimes(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
    }

    //Number of ones in binary form
    public int hammingWeight(int n) {
        int count = 0;

    while (n != 0) {
        count += (n & 1);
        n >>>= 1;   
    }

    return count;   
    }

    //GCD of an Array
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[nums.length -1];
        for(int i = 0;i < nums.length;i++){
            if(nums[i]<min)
            min = nums[i];
            if(nums[i]>max)
            max = nums[i];
        }
        return GCD(min,max);
    }
    private int GCD(int a,int b){
        if(b == 0)return a;
        return GCD(b,a % b);
    }

    //Exactly 3 divisors
    public boolean isThree(int n) {
        if(n < 4)return false;
        int count;
        if(n % 2 == 0){
            count = 2;
        }else count = 1;
        for(int i = 3;i <= n;i++){
            if(n%i == 0)count++;
        }
        if(count != 3)return false;
        return true;
    }

    //Least Common Multiple of 2 and n
    public int smallestEvenMultiple(int n) {
        if(n == 1 || n == 2)return 2;
        if(n % 2 == 0)return n;
        return 2*n;
    }

    //Number of Common Factors
    public int commonFactors(int a, int b) {
        int count = 0;
        int n;
        if(a>b)n = b;
        else n = a;
        for(int i = 1;i <= n;i++){
            if(a%i == 0 && b%i == 0)
            count++;
        }
        return count;
    }

    //#2
    public int commonFactors2(int a, int b) {
        int g = GCD(a,b);
        int count = 0;
        for(int i = 1;i <= g;i++){
            if(g % i == 0)
            count++;
        }
        return count;
    }

    //Palindrome Prime
    public int primePalindrome(int n) {
        if (n <= 11 && n >= 8) return 11;

        for (int i = n; ; i++) {
            int len = String.valueOf(i).length();
            if (len % 2 == 0) {
                i = (int) Math.pow(10, len);
                continue;
        }
            if (isPrime(i)){
                if(isPalindrome(i))return i;
            }
        }
    }

    private boolean isPrime(int n){
        if(n < 2)return false;
        if(n == 2)return true;
        if(n%2 == 0)return false;

        for(int i = 3;i*i <= n;i += 2){
            if(n%i == 0)return false;
        }
        return true;
    }

    private boolean isPalindrome(int n){
        int pal = n;
        int sum = 0;
        while(pal != 0){
            sum = sum * 10 + (pal % 10);
            pal /= 10;  
        }
        return sum == n;
    }

    //CountPrimes
    public int countPrimesOptimized(int n) {
        if(n <= 2)return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);

        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2;i*i < n;i++){
            if(isPrime[i]){
                for(int j = i*i;j < n; j += i){
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for(int i = 2;i < n;i++){
            if(isPrime[i])count++;
        }
        return count;
    }
}