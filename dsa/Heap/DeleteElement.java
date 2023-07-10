public class DeleteElement {

    private Integer[] heap;
    private int n; //size of max heap

    public DeleteElement(int capacity) {
        heap = new Integer[capacity +1]; //index 0 is kept as empty
        n = 0;
    }

    public boolean isEmpty(){
        return n==0;
    }
    public int size() {
        return n;
    }

    public void insert(int x){
        if(n==heap.length-1){
            resize(2*heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);
    }
    private void swim(int k){
        while(k>1 && heap[k/2]<heap[k]){
            int temp = heap[k];
            heap[k]=heap[k/2];
            heap[k/2]=temp;
            k = k/2;
        }
    }

    private void resize(int capacity){
        Integer[] temp = new Integer[capacity];
        for(int i=0; i<heap.length; i++){
            temp[i] = heap[i];
        }
        heap=temp;
    }
    
    public void swap(int a, int b){
        int temp=heap[a];
        heap[a]=heap[b];
        heap[b]=temp;
    }
    
    public int DeleteMax(){
        int max = heap[1];
        swap(1,n);
        n--;
        sink(1);
        heap[n+1]= null;
        if(n>0 &&(n==heap.length-1/4)){
            resize(heap.length/2);
        }
        return max;
    }

    private void sink(int k) {
        while(2*k <= n){
            int j = 2*k;
            if(j<n && heap[j]<heap[j+1]){
                j++;
            }
            if(heap[k]>=heap[j]){
                break;
            }
            swap(k,j);
            k=j;
        }
    }

    public void printmaxHeap(){
        for(int i=1; i<=n; i++){
            System.out.print(heap[i]+ " ");
        }
        System.out.println(" "); 
    }

    public static void main(String[] args) {
        DeleteElement obj = new DeleteElement(3);
        obj.insert(4);
        obj.insert(5);
        obj.insert(2);
        obj.insert(6);
        obj.insert(1);
        obj.insert(3);
        System.out.println("Size is: "+ obj.size());

        obj.printmaxHeap();

        System.out.println("Deleted " + obj.DeleteMax());
        System.out.println("Deleted " + obj.DeleteMax());
        System.out.println("Deleted " + obj.DeleteMax());
        obj.printmaxHeap();


        // System.out.println(obj.isEmpty());
    }
}

