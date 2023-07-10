public class ArrangeArray {
     public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public void arrangeMaxMin(int[] arr){
        int maxIndex = arr.length - 1;
        int minIndex = 0;
        int max = arr[maxIndex] + 1;
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                arr[i] = arr[i] + (arr[maxIndex] % max) * max;
                maxIndex--;
            }
            else{
                arr[i] = arr[i] + (arr[minIndex] % max) * max;
                minIndex++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] / max;
        }
     }

    public static void main(String[] args)
    {
        int[] arr = {2, 3, 5, 6, 8, 9};

        ArrangeArray obj = new ArrangeArray();
        System.out.print("Before Function: ");
        obj.printArray(arr);
        obj.arrangeMaxMin(arr);
        System.out.print("After Function : ");
        obj.printArray(arr);


    };
}