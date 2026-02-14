package Learnings;

public class Sorting {

    //Bubble Sort
    public static void bubbleSort(int []nums){// O(n^2)
        for(int j = 0;j < nums.length-1;j++){
            for(int i = 0;i < nums.length-j-1;i++){
                if(nums[i+1] < nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
        }    
    }

    //Selection Sort
    public static void selectionSort(int []nums){
        
        for(int i = 0;i < nums.length-1;i++){
            int min = i;
            for(int j = i+1;j < nums.length;j++){
                if(nums[j] < nums[min])min = j;
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }

    public static void printArray(int []nums){
        for(int i = 0;i < nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {23,12,62,46,34,98,54,29};
        System.out.print("Original Array:");
        printArray(arr);
        //bubbleSort(arr);
        selectionSort(arr);
        System.out.print("\nSorted Array:");
        printArray(arr);
    }
}
