public class ResizeArray {
    static void printArray(int[] array){
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        
        System.out.println(" ");
        System.out.println("Size is "+ array.length);
    }

    public static int[] resize(int[] array){
        int capacity = array.length * 2;
        
        int[] temp = new int[capacity];

        for(int i = 0; i < array.length; i++){
            temp[i] = array[i];
        }

        return temp;
    }

    public static void main(String[] args){

        int[] array = {3, 8, 1, 2};
        printArray(array);
        int[] result = resize(array);   
        printArray(result);
    };
}
