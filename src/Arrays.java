import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int [] marks = new int [size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter the number");
            marks[i] = sc.nextInt();
        }
        //int [] marks = {89,99,92};
        //marks[0] = 89;
        //marks[1] = 99;
        //marks[2] = 92;
        /*System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);*/
        for(int i = 0; i < size; i++ ){
            System.out.println(marks[i]);
        }
    }

    //Search Insert Position
    public int searchInsert(int[] nums, int target) {
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == target)return i;
        }
        if(target < nums[0])return 0;
        if(target > nums[nums.length-1])return nums.length;
        for(int i = 0;i < nums.length-1;i++){
            if(target>nums[i] && target<nums[i+1])return i+1;
        }
        return 0;
    }
    
    //Plus One
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for(int i = length-1;i >= 0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] nDigits = new int[length+1];
        nDigits[0] = 1;
        return nDigits;
    }
}
