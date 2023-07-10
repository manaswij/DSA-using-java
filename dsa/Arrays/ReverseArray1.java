public class ReverseArray1{

    public static void reverse(int[] numbers, int start, int end){
        while(start<end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {2,11,5,10, 7,8};
        printArray(numbers);
        reverse(numbers, 0, numbers.length-1); // int start = 0; int end = array1.length; you can write it in function reverse also in this way
        printArray(numbers);
    }
}
