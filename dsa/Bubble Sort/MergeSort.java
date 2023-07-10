public class MergeSort {
 
    public void merge(int[] arr, int[] temp, int low, int mid, int high){
       for(int i = 0; i <= high; i++){
        temp[i] = arr[i];
       }
       int i = low; // Traverse left sorted sub-array
       int j = mid + 1; // Traverse right sorted sub-array
       int k = low; // Merges both arrays into Original Array arr[]

       while(i <= mid && j <= high){
        if(temp[i] < temp[j]){
            arr[k] = temp[i];
            i++;
        }
        else{
            arr[k] = temp[j];
            j++;
        }
        k++;
       }

       while(i <= mid){
        arr[k] = temp[i];
        i++;
        k++;
       }
    }

    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i< n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public void sort(int[] arr, int[] temp, int low, int high){
        if(low < high){
            int mid = low + (high - low) / 2;  // avoids overflow condition (low + high) / 2
            sort(arr, temp, low, mid);
            sort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }

    }

    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        int [] arr = {9, 5, 2, 4, 3};
        System.out.print("UnSorted Array: ");
        obj.printArray(arr);
        obj.sort(arr, new int[arr.length], 0, arr.length - 1);
        System.out.print("Sorted Array: ");
        obj.printArray(arr);
       
    }
}

