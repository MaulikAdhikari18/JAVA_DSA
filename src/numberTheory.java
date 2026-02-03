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
}