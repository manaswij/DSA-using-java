public class ReplaceElements {
    public int largest(int[] array,int length){
        // Initialzing max 
        int max = 0;
        
        // length + 1 ignores the present element thus checks the greatest element to the right
        for(int i = length+1; i<array.length; i++){  

            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
        }
    
    public int[] replaceElements(int[] arr) {
        // length = 0 points to the index position of array
        int length = 0;
        // putting arr in a variable array
        int[] array = arr;

        for(int i = 0; i < array.length - 1; i++){
            // calling largest function to give the largest element in the array barring length element
            array[i] = largest(array,length);
            length++;    
        }
        
        // replacing the last element by - 1
        array[array.length-1] = -1;
            
        return array;
    }
    }



















    public static void main(String[] args) {
        
    }
}
