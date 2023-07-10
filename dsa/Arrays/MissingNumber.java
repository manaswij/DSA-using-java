public class MissingNumber {
    static void printArray(int[] array){
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        
        System.out.println(" ");
    }

    static int findMissingNumber(int[] array){
        int n = array.length + 1;
        int sum = n * (n+1) / 2;

        /* for(int num: array){
            sum = sum - num; 
        } */

        for(int i = 0; i < array.length; i++){
            int num = array[i];
            sum = sum - num;
        }

        return sum;
    }

    public static void main(String[] args){

        int[] array = {1, 2, 3, 4, 8, 5, 6};
        printArray(array);
        int result = findMissingNumber(array);  
        System.out.println("Missing Number: " +result);
    };
}
