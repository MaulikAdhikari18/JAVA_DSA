package Problems;

import java.util.*;

public class BubbleSort {
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void printArr(int []a){
        for(int i = 0;i < a.length; i++){
            System.out.print(a[i] + "\t");
        }
    }
    public static void bubbleSort(int []arr){
        for(int i = 0;i < arr.length-1; i++ ){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    /*int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;*/
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void selectionSort(int []arr){
        for(int i =0; i < arr.length-1; i++){
            int min = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i)
            swap(arr,min,i);
        }
    }

    public static void main(String[] args) {
        int [] A = {77,63,94,43,51,66,};
        System.out.println("Original Array");
        printArr(A);
        //bubbleSort(A);
        selectionSort(A);
        System.out.println("\nSorted Array");
        printArr(A);
    }
}
