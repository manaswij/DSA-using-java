public class insertarray {
   
public static void main(String[] args) {
  
    int[] arr = new int[6];
    int length = 0;

    // Add 3 elements to the Array
    for (int i = 0; i < 3; i++) {
        arr[length] = i;
        length++;
        }
    
        arr[length] = 10;
        length++;
        arr[length] = 14;
        length++;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " contains " + arr[i]);
        }


    }
}


