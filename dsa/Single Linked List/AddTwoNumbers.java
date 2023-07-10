public class AddTwoNumbers {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        
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

   
    /* 
     *          9 4 7
     *          + 6 5
     *         ________
     *         1 0 1 2
     */

    // a --> 7 --> 4 --> 9 --> null
    // b --> 5 --> 6 --> null
    // result --> 2 --> 1 --> 0 --> 1 --> null

   

    public static ListNode add(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;

        while(a != null || b != null){
            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;   // Quotient: sum / 10
            tail.next = new ListNode(sum % 10);  // Remainder: sum % 10
            tail = tail.next;

            if(a != null) a = a.next;
            if(b != null) b = b.next;

        }

        if(carry > 0){
            tail.next = new ListNode(carry);
        }
        return dummy.next;
    }
   
    public static void main(String[] args) {
        AddTwoNumbers obj1 = new AddTwoNumbers();

        obj1.insertEnd(7);
        obj1.insertEnd(4);
        obj1.insertEnd(9);

        AddTwoNumbers obj2 = new AddTwoNumbers();

        obj2.insertEnd(5);
        obj2.insertEnd(6);
       

        obj1.display();
        obj2.display();

        AddTwoNumbers result = new AddTwoNumbers();

        // Using Dummy ListNode

        result.head = add(obj1.head, obj2.head);
        result.display();

       
    }
}
