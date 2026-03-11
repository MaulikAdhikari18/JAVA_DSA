package Problems;

public class BitManipulation {
    
    //Single Number
    public int singleNumber(int[] nums) {
        int single = 0;
        for(int i = 0;i < nums.length;i++){
            single = single ^ nums[i];
        }
        return single;
    }

    //Complement of Base 10
    public int bitwiseComplement(int n) {
        if(n == 0)return 1;

        int mask = 0;
        int temp = n;

        while(temp > 0){
            mask = (mask << 1) | 1;
            temp >>= 1;
        }
        return n ^ mask;
    }
}
