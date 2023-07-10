class InsertFirst{
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;
        }
    }

    public InsertFirst(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;  // head == null (also implies DLL is empty)
    }

    public int length(){
        return length;
    }

    public void displayForward(){
        if(head == null){
            return;
        }

        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println("");
    }


    public void displayBackward(){
        if(head == null){
            return;
        }

        ListNode temp = tail;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.print("null");
        System.out.println("");
    }


    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);

        if(isEmpty()){
            tail = newNode;
        }
        else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        }
        else{
            tail.next = newNode;
            newNode.previous=tail;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    

    
    public static void main(String[] args)
    {
        InsertFirst obj = new InsertFirst();

        obj.insertFirst(1);
        obj.insertFirst(2);
        obj.insertFirst(3);

        obj.displayForward();
        obj.displayBackward();
    };
    
}