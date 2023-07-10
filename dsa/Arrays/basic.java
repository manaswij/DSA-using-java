public class basic {
   
        public void printArray(int[] array){
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println(" ");
        }
    
        public void arrayDemo(){
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
    
    
            int[] arr = {1,0,1,2,3,3,4};
            printArray(arr);
        }
        public static void main(String[] args)
        {
            basic obj = new basic();
            obj.arrayDemo();
        };
}
//function is not static that is why object is used to print the array