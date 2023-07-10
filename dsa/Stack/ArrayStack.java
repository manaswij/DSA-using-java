public class ArrayStack {
    private int top;
    private int[] arr;

    // constructors
    public ArrayStack(int capacity){
        top = -1;
        arr = new int[capacity];
    }

    public ArrayStack(){
        this(10);
    }

    public boolean isFull(){
        return arr.length == size();
    }

    public int size(){
        return top + 1;
    }

    public boolean isEmpty(){
        return top < 0;
    }


    public void push(int data){
        if(isFull()){
            throw new RuntimeException("Stack is Full");
        }
        top++;
        arr[top] = data;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        int result = arr[top];
        top--;
        
        return result;
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        
        return arr[top];
    }

    public static void main(String[] args)
    {
        ArrayStack obj = new ArrayStack(3);

        obj.push(1);
        obj.push(2);
        obj.push(3);

        System.out.println("Peek Value: " + obj.peek());

        obj.pop();
        obj.pop();

        System.out.println("Peek Value: " + obj.peek());
    };


}
