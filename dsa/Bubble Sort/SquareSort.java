public class SquareSort {
    public int[] sortedSquares(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        int i = 0; int j = n - 1;
        for(int k = n - 1; k >= 0; k--){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                result[k] = arr[i] * arr[i];
                i++;
            }
            else{
                result[k] = arr[j] * arr[j];
                j--;
            }
        }
        return result;
    }

    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = {-4, -1, 0, 3, 10};
        int[] arr2 = {-4, -11, 2, 13, 10};

        SquareSort obj = new SquareSort();
        System.out.print("UnSorted Array: ");
        obj.printArray(arr);
        int result[] = obj.sortedSquares(arr);
        System.out.print("Sorted Array: ");
        obj.printArray(result);


    };
}