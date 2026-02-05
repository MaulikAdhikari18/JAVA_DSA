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
}