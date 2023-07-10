public class MaxHeap{

    private Integer[] heap;
    private int n; //size of max heap

    public MaxHeap(int capacity) {
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
    public void printmaxHeap(){
        for(int i=1; i<=n; i++){
            System.out.print(heap[i]+ " ");
        }
    }
    public static void main(String[] args) {
        MaxHeap obj = new MaxHeap(3);
        obj.insert(4);
        obj.insert(5);
        obj.insert(2);
        obj.insert(6);
        obj.insert(1);
        obj.insert(3);
        System.out.println(obj.size());
        obj.printmaxHeap();
        // System.out.println(obj.isEmpty());
    }
}