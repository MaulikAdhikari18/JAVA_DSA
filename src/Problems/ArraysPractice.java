package Problems;

import java.util.*;
public class ArraysPractice {
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

    //Remove duplicates from array
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)return 0;
         int count = 1;
         for(int i = 1;i < nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[count] = nums[i];
                count++;
            }
         }
         return count;
    }

    //remove element
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    //Merge Sorted Arrays
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else
                nums1[k--] = nums2[j--];
        }
        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }

    //Running sum
    public int[] runningSum(int[] nums) {
        int []sum = new int[nums.length];
        sum[0] = nums[0];
        for(int i = 1;i < nums.length;i++){
            sum[i] = sum[i-1] + nums[i];
        }
        return sum;
    }
}
