public class LinearSearch {
    public int search(int[] arr, int n, int x) {
        for(int i=0 ; i<n; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,9,2,10,15,20};
        LinearSearch obj = new LinearSearch();
        System.out.println("Element found: "+ obj.search(arr, arr.length, 50));
    }//time complexity 0[n]
}