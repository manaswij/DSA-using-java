public class mergeSLL {
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
        System.out.println(" ");
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
  
    public static ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(a!= null && b!=null){
            if(a.data <= b.data){
                tail.next = a;
                a=a.next;
            } else {
                tail.next = b;
                b=b.next;
            }
            tail=tail.next;
        }

        if(a==null){
            tail.next = b;
        }else{
            tail.next = a;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        mergeSLL obj = new mergeSLL();
        obj.insertEnd(1);
        obj.insertEnd(2);
        obj.insertEnd(3);

        mergeSLL obj1 = new mergeSLL();
        obj1.insertEnd(4);
        obj1.insertEnd(5);
        obj1.insertEnd(6);


        obj.display();
        obj1.display();

        mergeSLL result = new mergeSLL();
        result.head = merge(obj.head, obj1.head);

        result.display();
       
    }

}
