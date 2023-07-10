public class SearchInsert {
    public int searchInsert(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target){
                System.out.println(target + " found at index " + mid);
            return mid;
            }
            if (target < arr[mid]) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        System.out.println(target + " can be inserted at index " + low);

        return low;
    }

    public void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        SearchInsert bs = new SearchInsert();
        int[] array = { 1, 2, 3, 4, 5, 54, 300 };
        // int[] array = {1,10,20,47,59,65,75,88,99};
        bs.printArray(array);
        bs.searchInsert(array, 6);

    };
}

// Linear Search takes O(n) time
// Binary Search takes O(log n) time [lesser than O(n)]


