public class InsertNodeSorted {
    private static ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display() 
    {
        
        ListNode current = head;

        while(current != null){
            System.out.print(current.data+ " --> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println("");
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;

    }

    public void insertEnd(int value){

        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }

        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;

    }
    public ListNode inserInSortedList(int value){
        ListNode newNode = new ListNode(value);

        if(head == null){
            return newNode;        
        }
 
        ListNode current = head;
        ListNode temp = null;
        
        while(current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        
        newNode.next = current;
        temp.next = newNode;
        return head;
    
}

    public static void main(String[] args) {
            InsertNodeSorted obj = new InsertNodeSorted();
            obj.insertFirst(5);
            obj.insertFirst(4);
            obj.insertFirst(4);
            obj.insertFirst(3);
            obj.insertFirst(1);
            obj.insertFirst(1);
    
            obj.display();
            obj.inserInSortedList(2);
            obj.display();
            
        }
}
