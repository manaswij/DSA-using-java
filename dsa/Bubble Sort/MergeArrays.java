public class MergeArrays {
 
    public int[] merge(int[] arr1, int[] arr2, int n, int m){
        int [] result = new int [n+m];
        int i=0; //traverse arr1
        int j=0; //traverse arr2
        int k=0; //traverse result

        while(i<n && j<m){ // boundary conditions
            if(arr1[i]<arr2[j]){
                result[k] = arr1[i];
                i++;
            }else {
                result[k]= arr2[j];
                j++;
            }
            k++;
        }

        //either arr1 got exhausted or arr2 got exhausted
        while(i<n){
          result[k] = arr1[i];
          i++;
          k++;  
        }
        while(j<m){
          result[k] = arr2[j];
          j++;
          k++;  
        }
        return result;
    }
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i< n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeArrays obj = new MergeArrays();
        int [] arr1 = {1,2,9,10};
        int [] arr2 = {4,6,8,12};
        obj.printArray(arr1);     
        obj.printArray(arr2);  
        int [] result= obj.merge(arr1,arr2,arr1.length,arr2.length);
        obj.printArray(result);
    }
}
