public class SecondMaximum {
    public static void printArray(int[] array){
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public static int findSecondmax(int[] arr){
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
  
    for(int i=0; i < arr.length; i++){
        if (arr[i]> max){
            secondMax = max;
            max = arr[i];
        }
        else if (arr[i] > secondMax && arr[i] != max){
            secondMax = arr[i];
        }
    }
    return secondMax;
    }
   

    public static void main(String[] args) {
        int[] numbers = {13,34,2,23,32,34,33,1};
        printArray(numbers);
        System.out.println("Second Max: " + findSecondmax(numbers));
    }
 
}
