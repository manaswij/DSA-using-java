public class ReverseArray {
    public static void printArray(int[] array){
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    static int[] reverseArray(int[] manaswi){

        int[] resultArray = new int[manaswi.length];
        int resultIndex = 0;
        for(int i = manaswi.length - 1; i >= 0; i--){
            //manaswi[i] = resultArray[resultIndex];
            resultArray[resultIndex] = manaswi[i];
            resultIndex++;
        }
        
        return resultArray;
    }
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,6};
        printArray(array);
        int[] anish = reverseArray(array);
        printArray(anish);
        
    };
}
