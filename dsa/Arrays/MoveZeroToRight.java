public class MoveZeroToRight {
    static void printArray(int[] array){
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    
        System.out.println(" ");
    }

    static int[] moveZeros(int[] array){
        int j = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != 0 && array[j] == 0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            if(array[j] != 0){
                j++;
            }
        }

        return array;
    }

    public static void main(String[] args){

        int[] array = {0, 8, 0, 1, 0, 2, 1, 0, 3};
        printArray(array);
        int[] result = moveZeros(array);   
        printArray(result);
    };
}




