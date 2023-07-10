import java.util.Stack;

public class NextElement {

    static int[] nextGreaterElement(int[] arr){
    int[] result = new int[arr.length];
    Stack<Integer> stack = new Stack<>();

    for(int i = arr.length - 1; i>=0; i--){
        if(!stack.isEmpty() && stack.peek() <= arr[i]){
            stack.pop();
        }
    
    if(stack.isEmpty()){
        result[i] = -1;
    } else {
        result[i] = stack.peek();
    }
    stack.push(arr[i]);
  }
  return result;
  }

  public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] +" ");
        }
        System.out.println(" ");
    }
   
  public static void main(String[] args) {
        int[] arr1 = {1,2,7,1,8,3,4};
        printArray(arr1);
        int[] result = nextGreaterElement(arr1);
        printArray(result);
    }
}

