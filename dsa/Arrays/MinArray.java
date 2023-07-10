public class MinArray {
    public static void printArray(int[] array){
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

   public static int findMinimum(int[] arr){
    if(arr==null || arr.length == 0){
        throw new IllegalArgumentException("Invalid input");
    }

    int min = arr[0];
    for(int i = 1; i < arr.length; i++){
        if(arr[i]<min){
            min = arr[i];
        }
    }
    return min;
   } 

   public static void main(String[] args) {
    int[] arr ={5,9,3,15,1,2};
   System.out.println("Min value: " + findMinimum(arr));
   }
}
