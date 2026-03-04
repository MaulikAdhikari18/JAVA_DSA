package Learnings;

public class Sorting {

    //Bubble Sort
    // O(n^2)
    public static void bubbleSort(int []nums){
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
    // O(n^2)
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

    //Insertion Sort
    //O(n^2)
    public static void insertionSort(int []nums){
        for(int i = 1;i < nums.length;i++){
            int current = nums[i];
            int j = i-1;
            while(j >= 0 && current < nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = current;
        }
    }

    public static void printArray(int []nums){
        for(int i = 0;i < nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    //Merge Sort
    public static void merge(int[] arr,int si,int mid,int ei){
        int []merged = new int[ei - si + 1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                merged[k++] = arr[i++];
            }else{
                merged[k++] = arr[j++];
            }
        }

        while(i <= mid){
            merged[k++] = arr[i++];
        }

        while(j <= ei){
            merged[k++] = arr[j++];
        }

        for(int l = si,m = 0;m < merged.length;l++,m++){
            arr[l] = merged[m];
        }
    }

    public static void mergeSort(int[] arr,int si,int ei){
        if(si >= ei)return;
        int mid = si + (ei - si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }

    //Quick Sort
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j = low;j < high;j++){
            if(arr[j] < pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int[] arr,int low,int high){
        if(low < high){
            int pivot = partition(arr,low,high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot+1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {23,12,62,46,34,98,54,29};
        System.out.print("Original Array:");
        printArray(arr);
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        //mergeSort(arr,0,arr.length-1);
        quickSort(arr,0,arr.length-1);
        System.out.print("\nSorted Array:");
        printArray(arr);
    }
}
