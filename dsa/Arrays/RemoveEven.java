public class RemoveEven {
    public static void printArray(int[] array){
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public static int[] RemoveEven(int[] arr){
        int oddCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 != 0)
            oddCount++; //oddcount = 3
        }

        int [] result = new int[oddCount];
        int idx = 0;
        for(int i = 0; i< arr.length; i++){
        
                if(arr[i] % 2 != 0){
                    arr[idx] = arr[i];
                    idx++;
                }
            
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array1 = {3,2,4,6,7,9,8,5};
        printArray(array1);
        int[] result1 = RemoveEven(array1);
        printArray(result1);
    }
}
