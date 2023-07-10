public class basic2 {
    public static void printArray(int[] array){
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args)
    {
        int[] array = new int[5];
        // Default value is 0 initially
        printArray(array);
        array[0] = 5;
        array[1] = 1;
        array[2] = 2;
        array[3] = 6;
        array[4] = 8;
        printArray(array);
        System.out.println("After updating the value at index 3");
        array[3] = -3;
        printArray(array);

        //int[] array1 = {10,101,101,101,10};
        //printArray(array1);


        //int[] arr = {1,0,1,2,3,3,4};
        //printArray(arr);
    };
}
//static function thus object is not required