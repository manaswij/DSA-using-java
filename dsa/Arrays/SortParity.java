public class SortParity {
    static void printArray(int[] array){
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    
        System.out.println(" ");
    }

    public static int[] SortParity(int[] arr){
        int start = 0, end = arr.length - 1;

        while (start < end) {
            if (arr[start] % 2 == 0) {
                start++;
            } else {
                int tmp = arr[end];
                arr[end] = arr[start];
                end--;
                arr[start] = tmp;
            }
        }
        

        return arr;
    }

    public static void main(String[] args){

        int[] array = {3,1,2,4};
        printArray(array);
        int[] result = SortParity(array);   
        printArray(result);
    };
}

