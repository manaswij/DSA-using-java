public class ReverseSLL {
    private static ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(ListNode head) // input head since there zre more than 1 SLL's
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

    public ListNode reverse(ListNode head){
        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

   
    public static void main(String[] args) {
        ReverseSLL obj = new ReverseSLL();
        obj.insertFirst(1);
        obj.insertFirst(2);
        obj.insertFirst(3);
        obj.insertFirst(4);
        
        obj.insertEnd(10);
        obj.insertEnd(11);
        obj.insertEnd(12);

        
        obj.display(head);
        
        // obj.display(obj.reverse(head));
        
        ListNode reverseList = obj.reverse(head);
        obj.display(reverseList);

        //returns list just like array we assign to a
       
    }
}
