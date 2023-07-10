public class BinarySearch {
    public int binarySearch(int[] arr, int key){
       int low = 0;
       int high = arr.length - 1;
       while(low <= high){
        int mid = (high + low) / 2;
        if(arr[mid] == key){
            System.out.println(key + " found at index " + mid);
            return mid;
        }
        if(key < arr[mid]){
            high = mid - 1;
        }
        else{
            low = mid + 1;
        }
       }
        System.out.println(key+ " not found");
        return -1;
    }
    public void printArray(int[] arr){
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args)
    {
        BinarySearch bs = new BinarySearch();
        int[] array = {1,2,3,4,5,54,300};
        //int[] array = {1,10,20,47,59,65,75,88,99};
        bs.printArray(array);
        bs.binarySearch(array, 54);
    };//time complexity 0[log n]
}
