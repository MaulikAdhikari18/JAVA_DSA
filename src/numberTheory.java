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
}